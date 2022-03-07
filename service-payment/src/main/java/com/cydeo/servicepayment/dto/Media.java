package com.cydeo.servicepayment.dto;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class Media {

    public static enum MediaType {
        LOGO, ICON
    }

    String uri;
    MediaType type;
}
