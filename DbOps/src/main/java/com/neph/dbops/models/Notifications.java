package com.neph.dbops.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.sql.Blob;
import java.time.LocalDate;

@Getter
@Setter
@ToString
@Entity
@Table(name = "BPR_C2B_NOTIFICATIONS")
public class Notifications implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    private Long id;

    @Column(name = "REQUEST")
    @Lob
    private Blob request;

    @Column(name = "RESPONSE")
    @Lob
    private Blob response;

    @Column(name = "RECORD_ERRORS")
    @Lob
    private Blob recordErrors;

    @Column(name = "CREATEDAT")
    private LocalDate createdAt;

    @Column(name = "NOTIFICATIONTYPE", length = 20)
    private String notificationType;

    @Column(name = "STATUSCODE", length = 20)
    private String statusCode;

    @Column(name = "STATUSMESSAGE", length = 200)
    private String statusMessage;

    @Column(name = "ACCOUNTNUMBER", length = 20)
    private String accountNumber;

    @Column(name = "ACCOUNTOWNER", length = 200)
    private String accountOwner;

    @Column(name = "RETRIES")
    private Long retries;

}