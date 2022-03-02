package com.cydeo.serviceinvoice.enums;

public enum InvoiceType {

    PURCHASE("PURCHASE"), SALES("Sales Invoice");

    private String value;

    InvoiceType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

}
