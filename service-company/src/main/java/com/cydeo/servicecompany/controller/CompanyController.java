package com.cydeo.servicecompany.controller;

import com.cydeo.servicecommon.contract.CompanyDto;
import com.cydeo.servicecommon.contract.UserDto;
import com.cydeo.servicecompany.service.CompanyService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/companies")
public class CompanyController {

    private final CompanyService companyService;

    @GetMapping("/all")
    public ResponseEntity<List<CompanyDto>> getAll(){
        return ResponseEntity.ok(companyService.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<CompanyDto> get(@PathVariable("id") Long id){
        return ResponseEntity.ok(companyService.get(id));
    }

//    @GetMapping("/name")
//    public ResponseEntity<CompanyDto> get(@RequestParam(value = "company_name") String companyName){
//        return ResponseEntity.ok(companyService.get(companyName));
//    }

    @GetMapping("/users")
    public ResponseEntity<List<UserDto>> getAllUsersOfCompany(@RequestParam("company_id") Long companyId) {
        return ResponseEntity.ok(companyService.getAllUsersOfCompany(companyId));
    }

    @PostMapping
    public ResponseEntity<CompanyDto> save(@RequestBody CompanyDto companyDto){
        return ResponseEntity.ok(companyService.create(companyDto));
    }

    @PutMapping
    public ResponseEntity<CompanyDto> update(@RequestBody CompanyDto companyDto){
        return ResponseEntity.ok(companyService.update(companyDto));
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id){
        companyService.delete(id);
    }
}
