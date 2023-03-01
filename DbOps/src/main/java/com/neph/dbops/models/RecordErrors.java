package com.neph.dbops.models;

import lombok.Getter;
import lombok.Setter;

/**
 * @ Author NMuchiri
 **/
@Getter
@Setter
public class RecordErrors {
    private String accountNumber;
    private String errorMessage;
    private String fieldName;
    private String fieldValue;
    private String errorCode;
}
