package com.neph.dbops.service.impl;

import com.neph.dbops.models.Notifications;
import com.neph.dbops.repo.NotificationRepo;
import com.neph.dbops.service.NotificationsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.EnableScheduling;

import java.util.List;

/**
 * @ Author NMuchiri
 **/

@Slf4j
public class NotificationsServiceImpl implements NotificationsService {

    private final NotificationRepo notificationRepo;

    public NotificationsServiceImpl(NotificationRepo notificationRepo) {
        this.notificationRepo = notificationRepo;
    }


    @Override
    public void saveAllRecords(List<Notifications> notificationsList) {

    }
}
