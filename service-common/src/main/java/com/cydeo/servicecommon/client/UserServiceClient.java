package com.cydeo.servicecommon.client;

import com.cydeo.servicecommon.contract.UserDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient("service-user")
public interface UserServiceClient {

    @GetMapping("/users")
    ResponseEntity<List<UserDto>> getAllUsersOfCompany(@RequestParam("company_id") Long companyId);

}
