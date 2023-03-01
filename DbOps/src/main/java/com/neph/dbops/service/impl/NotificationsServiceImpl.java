package com.neph.dbops.service.impl;

import com.neph.dbops.models.Notifications;
import com.neph.dbops.models.RequestPayload;
import com.neph.dbops.models.ResponsePayload;
import com.neph.dbops.repo.NotificationRepo;
import com.neph.dbops.service.NotificationsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.io.*;
import java.sql.Blob;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.GZIPInputStream;

/**
 * @ Author NMuchiri
 **/

@Slf4j
@Service
public class NotificationsServiceImpl implements NotificationsService {

    private final NotificationRepo notificationRepo;

    public NotificationsServiceImpl(NotificationRepo notificationRepo) {
        this.notificationRepo = notificationRepo;
    }


    @Override
    public void saveAllRecords(List<Notifications> notificationsList) {

    }

    @Override
    public ResponseEntity<List<ResponsePayload>> findAllByStatusAndRecordType(RequestPayload requestPayload) {

        String notificationType = requestPayload.getNotificationType();
        String statusMessage = requestPayload.getStatusMessage();

        List<Notifications> notificationResponses = notificationRepo.findAllByNotificationTypeAndStatusMessage(notificationType, statusMessage);
        ResponsePayload responsePayload = new ResponsePayload();
        List<ResponsePayload> responsePayloadList = new ArrayList<>();

        for (Notifications notification : notificationResponses){
            try {
                Blob requestBlob = notification.getRequest();
                Blob responseBlob = notification.getResponse();
                Blob recordErrorsBlob = notification.getRecordErrors();

                byte[] requestData = requestBlob.getBytes(1, (int) requestBlob.length());
                String requestString = new String(requestData);
                requestString = requestString.replaceAll("^\"|\"$", "");
                responsePayload.setRequest(requestString);

                // RESPONSE MESSAGES
                if (responseBlob != null){
//                    byte[] responseData = responseBlob.getBytes(1L, (int) responseBlob.length());
//                    String responseString = new String(responseData);

//                    String responseString = new String(responseBlob.getBytes(1L, (int)responseBlob.length()));
//                    responseString = responseString.replaceAll("^\"|\"$", "");

                    String responseString = null;
                    try {
                        responseString = blobToString(responseBlob);
                        responseString = responseString.replaceAll("^\"|\"$", "");
                    } catch (IOException e) {
                        log.error("ERROR WHILE GETTING RESPONSE BLOB {}", e.getMessage());
                    }
                    responsePayload.setResponse(responseString);


                }

                // RECORD ERRORS FROM FAILED REQUESTS
                if (recordErrorsBlob != null){
                    byte[] recordErrorsData = recordErrorsBlob.getBytes(1, (int) recordErrorsBlob.length());
                    String recordErrors = new String(recordErrorsData);
                    recordErrors = recordErrors.replaceAll("^\"|\"$", "");
                    recordErrors = recordErrors.replace("\\","");
                    responsePayload.setRecordErrors(recordErrors);
                }

                responsePayload.setStatusMessage(notification.getStatusMessage());
                responsePayload.setId(notification.getId());

                responsePayloadList.add(responsePayload);

            } catch (SQLException e) {
                log.error("ERROR WHILE DESERIALIZING BLOB");
            }
        }


        return new ResponseEntity<>(responsePayloadList, HttpStatus.OK);
    }

    private String blobToString(Blob responseBlob) throws IOException {
        byte[] data = new byte[0];
        BufferedInputStream inputStream = null;
        try {
            data = new byte[(int) responseBlob.length()];
            inputStream = new BufferedInputStream(responseBlob.getBinaryStream());
            inputStream.read(data);

        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            assert inputStream != null;
            inputStream.close();
        }
        int chunk = 65536;
        ByteArrayInputStream bis = new ByteArrayInputStream(data);
        GZIPInputStream gis = new GZIPInputStream(bis);
        int length = 0;
        byte[] buffer = new byte[chunk];
        ByteArrayOutputStream bos = new ByteArrayOutputStream();

        while ((length=gis.read(buffer, 0, chunk)) != -1){
            bos.write(buffer, 0, length);
        }

        gis.close();
        bis.close();
        bos.close();

        return bos.toString();
    }


}
