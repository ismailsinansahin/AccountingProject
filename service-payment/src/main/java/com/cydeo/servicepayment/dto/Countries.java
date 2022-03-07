package com.cydeo.servicepayment.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Value;

@Builder
@AllArgsConstructor
public class Countries {
    String displayName;
    String countryCode2;
}
