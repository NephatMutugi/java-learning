package com.neph.dbops.service;

import com.neph.dbops.models.Notifications;
import com.neph.dbops.models.RequestPayload;
import com.neph.dbops.models.ResponsePayload;
import org.springframework.http.ResponseEntity;

import java.util.List;

/**
 * @ Author NMuchiri
 **/
public interface NotificationsService {

    void saveAllRecords(List<Notifications> notificationsList);

    ResponseEntity<List<ResponsePayload> > findAllByStatusAndRecordType(RequestPayload requestPayload);
}
