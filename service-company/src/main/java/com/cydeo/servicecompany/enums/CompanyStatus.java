package com.cydeo.servicecompany.enums;

import lombok.Getter;

@Getter
public enum CompanyStatus {

    ACTIVE("Active"),CLOSED("Closed");

    private final String value;

    CompanyStatus(String value) {
        this.value = value;
    }
}
