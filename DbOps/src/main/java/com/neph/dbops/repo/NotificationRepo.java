package com.neph.dbops.repo;

import com.neph.dbops.models.Notifications;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @ Author NMuchiri
 **/
public interface NotificationRepo extends JpaRepository<Notifications, Long> {

    @Override
    List<Notifications> findAll();
    List<Notifications> findAllByNotificationTypeAndStatusMessage(String notificationType, String statusMessage);
}
