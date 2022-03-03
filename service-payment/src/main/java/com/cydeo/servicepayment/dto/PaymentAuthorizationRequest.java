package com.cydeo.servicepayment.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.sun.istack.NotNull;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.UUID;


@JsonInclude(JsonInclude.Include.NON_NULL)
public class PaymentAuthorizationRequest {
    @NotNull
    private String requestId; // potentially optional, used as idempotency id
    @NotNull
    private String applicationUserId; // potentially optional as could come from config
    @NotNull
    private String institutionId;

    @NotNull
    @Size(min = 6, max = 6)
    @Pattern(regexp = "[0-9]*", message = "Must contain numbers")
    private String sortCode; // recipient, int?

    @NotNull
    @Size(min = 6, max = 9)
    @Pattern(regexp = "[0-9]*", message = "Must contain numbers")
    private String accountNumber; // recipient, int ?

    @NotNull
    @Min(50)
    @Max(1000)
    private Integer amount;
    @NotNull
    private String name;


    // Optional

    private String currency = "GBP";
    private String userId;

    @Max(18)
    private String reference;

    public String getRequestId() {
        return null == requestId ? UUID.randomUUID().toString().replace("-","") : requestId;
    }


}
