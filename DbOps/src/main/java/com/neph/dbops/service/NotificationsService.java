package com.neph.dbops.service;

import com.neph.dbops.models.Notifications;

import java.util.List;

/**
 * @ Author NMuchiri
 **/
public interface NotificationsService {

    void saveAllRecords(List<Notifications> notificationsList);
}
