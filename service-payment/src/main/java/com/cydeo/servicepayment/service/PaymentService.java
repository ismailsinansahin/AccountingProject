package com.cydeo.servicepayment.service;

import com.cydeo.servicepayment.dto.Institution;
import com.cydeo.servicepayment.dto.InstitutionsResponse;
import reactor.core.publisher.Mono;

import java.util.List;

public interface PaymentService {
    InstitutionsResponse getInstitutions();
    String generateToken();
    String accountAuth();

}
