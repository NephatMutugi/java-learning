package com.neph.dbops.controller;

import com.neph.dbops.models.RequestPayload;
import com.neph.dbops.service.NotificationsService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ Author NMuchiri
 **/
@RequestMapping("api/v1/notifications")
@RestController
public class NotificationsController {

    private final NotificationsService notificationsService;

    public NotificationsController(NotificationsService notificationsService) {
        this.notificationsService = notificationsService;
    }

    @PostMapping(consumes = "application/json")
    public ResponseEntity<?> notificationsRequest(@RequestBody RequestPayload requestPayload){
        return notificationsService.findAllByStatusAndRecordType(requestPayload);
    }
}
