package com.neph.dbops.repo;

import com.neph.dbops.models.BprC2bNotification;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @ Author NMuchiri
 **/
public interface CrbNotificationRepo extends JpaRepository<BprC2bNotification, Long> {
}
