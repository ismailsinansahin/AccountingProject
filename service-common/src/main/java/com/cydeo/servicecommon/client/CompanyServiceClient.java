package com.cydeo.servicecommon.client;

import com.cydeo.servicecommon.contract.CompanyDto;
import com.cydeo.servicecommon.general.ResponseWrapper;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@FeignClient("service-company")
public interface CompanyServiceClient {

    @GetMapping("/api/v1/companies/all")
    ResponseEntity<ResponseWrapper> getAll();

    @GetMapping("/api/v1/companies/{id}")
    ResponseEntity<ResponseWrapper> getById(@PathVariable("id") Long id);

    @GetMapping("/api/v1/companies")
    ResponseEntity<ResponseWrapper> getByName(@RequestParam(value = "companyName") String companyName);

    @PostMapping("/api/v1/companies")
    ResponseEntity<ResponseWrapper> save(@RequestBody CompanyDto companyDto);

    @PutMapping("/api/v1/companies/{id}")
    ResponseEntity<ResponseWrapper> update(@RequestBody CompanyDto companyDto, @PathVariable("id") Long id);

    @DeleteMapping("/api/v1/companies/{id}")
    ResponseEntity<Object> delete(@PathVariable("id") Long id);

}