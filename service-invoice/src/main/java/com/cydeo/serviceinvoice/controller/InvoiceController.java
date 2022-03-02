package com.cydeo.serviceinvoice.controller;

import com.cydeo.servicecommon.contract.InvoiceDto;
import com.cydeo.servicecommon.general.ResponseWrapper;
import com.cydeo.serviceinvoice.service.InvoiceService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/invoices")
public class InvoiceController {

    private final InvoiceService invoiceService;

    public InvoiceController(InvoiceService invoiceService) {
        this.invoiceService = invoiceService;
    }

    @GetMapping("/all")
    public ResponseEntity<ResponseWrapper> getAll(){
        return ResponseEntity.ok(new ResponseWrapper("Invoices are retrieved", invoiceService.getAll()));
    }

    @GetMapping("/{invoiceId}")
    public ResponseEntity<ResponseWrapper> getById(@PathVariable("invoiceId") Long invoiceId){
        return ResponseEntity.ok(new ResponseWrapper("Invoice is retrieved", invoiceService.get(invoiceId)));
    }

    @GetMapping
    ResponseEntity<ResponseWrapper> getByName(@RequestParam(value = "invoiceNo") String invoiceNo){
        return ResponseEntity.ok(new ResponseWrapper("Invoice is retrieved", invoiceService.getByInvoiceNo(invoiceNo)));
    }

    @PostMapping
    public ResponseEntity<ResponseWrapper> save(@RequestBody InvoiceDto invoiceDto){
        return ResponseEntity.ok(new ResponseWrapper("Invoice is created", invoiceService.create(invoiceDto)));
    }

    @PutMapping("/{invoiceId}")
    public ResponseEntity<ResponseWrapper> update(@RequestBody InvoiceDto invoiceDto, @PathVariable("invoiceId") Long invoiceId){
        return ResponseEntity.ok(new ResponseWrapper("Invoice is updated", invoiceService.update(invoiceDto,invoiceId)));
    }

    @DeleteMapping("/{invoiceId}")
    public ResponseEntity<Object> delete(@PathVariable("invoiceId") Long invoiceId){
        invoiceService.delete(invoiceId);
        return ResponseEntity.noContent().build();
    }

//    @GetMapping("/users")
//    public ResponseEntity<List<UserDto>> getAllUsersOfCompany(@RequestParam("company_id") Long companyId) {
//        return ResponseEntity.ok(invoiceService.getAllUsersOfCompany(companyId));
//    }

}
