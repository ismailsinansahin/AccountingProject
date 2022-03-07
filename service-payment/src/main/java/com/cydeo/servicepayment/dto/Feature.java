package com.cydeo.servicepayment.dto;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Value;

@Value
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class Feature {

    public static Feature PIS_UK = new Feature("INITIATE_DOMESTIC_SINGLE_PAYMENT");
    public static Feature PAY_INT = new Feature("INITIATE_INTERNATIONAL_SINGLE_PAYMENT");
    private String name;

}
