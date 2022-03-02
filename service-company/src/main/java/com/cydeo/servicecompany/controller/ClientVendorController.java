package com.cydeo.servicecompany.controller;


import com.cydeo.servicecommon.contract.ClientVendorDto;
import com.cydeo.servicecommon.contract.CompanyDto;
import com.cydeo.servicecommon.contract.UserDto;
import com.cydeo.servicecommon.general.ResponseWrapper;
import com.cydeo.servicecompany.service.ClientVendorService;
import com.cydeo.servicecompany.service.CompanyService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/clientvendors")
public class ClientVendorController {

    private final ClientVendorService clientVendorService;

    @GetMapping("/all")
    public ResponseEntity<ResponseWrapper> getAll(){
        return ResponseEntity.ok(new ResponseWrapper("Client-Vendors are retrieved",clientVendorService.getAll()));
    }

    @GetMapping("/{id}")
    public ResponseEntity<ResponseWrapper> getById(@PathVariable("id") Long id){
        return ResponseEntity.ok(new ResponseWrapper("Client-Vendor is retrieved",clientVendorService.getById(id)));
    }

    @PostMapping
    public ResponseEntity<ResponseWrapper> save(@RequestBody ClientVendorDto clientVendorDto){
        return ResponseEntity.ok(new ResponseWrapper("Client-Vendor is created", clientVendorService.create(clientVendorDto)));
    }

    @PutMapping("/{id}")
    public ResponseEntity<ResponseWrapper> update(@RequestBody ClientVendorDto clientVendorDto, @PathVariable("id") Long id){
        return ResponseEntity.ok(new ResponseWrapper("Company is updated",clientVendorService.update(clientVendorDto,id)));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> delete(@PathVariable("id") Long id){
        clientVendorService.delete(id);
        return ResponseEntity.noContent().build();
    }

//    @GetMapping("/users")
//    public ResponseEntity<List<UserDto>> getAllUsersOfCompany(@RequestParam("company_id") Long companyId) {
//        return ResponseEntity.ok(clientVendorService.getAllUsersOfCompany(companyId));
//    }
}
