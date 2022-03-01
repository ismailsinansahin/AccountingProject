package com.cydeo.servicecompany.enums;

import lombok.Getter;

@Getter
public enum States {

    UNITED_STATES_OF_AMERICA("United States Of America"),
    UNITED_KINGDOM("United Kingdom"),
    GERMANY("Germany"), FRANCE("France"), BELGIUM("Belgium"),
    BRAZIL("Brazil"), JAPAN("Japan"), CHINA("China"), CANADA("Canada");

    private final String value;

    States(String value) {
        this.value = value;
    }
}
