package com.cydeo.servicecompany.controller;

import com.cydeo.servicecommon.contract.CompanyDto;
import com.cydeo.servicecommon.contract.UserDto;
import com.cydeo.servicecommon.general.ResponseWrapper;
import com.cydeo.servicecompany.service.CompanyService;
import lombok.Builder;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/companies")
@Builder
public class CompanyController {

    private final CompanyService companyService;

    @GetMapping("/all")
    public ResponseEntity<ResponseWrapper> getAll(){
        return ResponseEntity.ok(new ResponseWrapper("Companies are retrieved",companyService.getAll()));
    }

    @GetMapping("/{id}")
    public ResponseEntity<ResponseWrapper> getById(@PathVariable("id") Long id){
        return ResponseEntity.ok(new ResponseWrapper("Company is retrieved",companyService.get(id)));
    }

    @GetMapping
    ResponseEntity<ResponseWrapper> getByName(@RequestParam(value = "companyName") String companyName){
        return ResponseEntity.ok(new ResponseWrapper("Company is retrieved",companyService.getByName(companyName)));
    }



    @PostMapping
    public ResponseEntity<ResponseWrapper> save(@RequestBody CompanyDto companyDto){
        return ResponseEntity.ok(new ResponseWrapper("Company is created", companyService.create(companyDto)));
    }

    @PutMapping("/{id}")
    public ResponseEntity<ResponseWrapper> update(@RequestBody CompanyDto companyDto, @PathVariable("id") Long id){
        return ResponseEntity.ok(new ResponseWrapper("Company is updated",companyService.update(companyDto,id)));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> delete(@PathVariable("id") Long id){
        companyService.delete(id);
        return ResponseEntity.noContent().build();

    }

    @GetMapping("/users")
    public ResponseEntity<List<UserDto>> getAllUsersOfCompany(@RequestParam("company_id") Long companyId) {
        return ResponseEntity.ok(companyService.getAllUsersOfCompany(companyId));
    }
}
