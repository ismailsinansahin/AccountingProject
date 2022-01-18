package com.cydeo.servicecommon.client;

import com.cydeo.servicecommon.contract.CompanyDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("service-company")
public interface CompanyServiceClient {

    @GetMapping("/companies")
    ResponseEntity<CompanyDto> get(@RequestParam(value = "company_name") String companyName);

}