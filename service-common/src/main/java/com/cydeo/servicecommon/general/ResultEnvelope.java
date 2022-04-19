package com.cydeo.servicecommon.general;


import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@Setter
@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
//@AllArgsConstructor(access = AccessLevel.PUBLIC)
@JsonInclude(JsonInclude.Include.NON_NULL)
@ToString
@RequiredArgsConstructor
public class ResultEnvelope<T> {

    private final boolean success;
    private Integer code;
    private final Date createdAt;
    private final String request_Id;
    private final T data;
    private final Map<String, String> metaData;

    private final List<ApiError> errors;


    public static <T> ResultEnvelope ok(T data) {
        return new ResultEnvelope(true, 200, new Date(), UUID.randomUUID().toString(), data, null, null);
    }

    public static <T> ResultEnvelope fail(Integer code, List<ApiError> errors) {

        return new ResultEnvelope(false, code, new Date(), UUID.randomUUID().toString(), null, null, errors);
    }

}
