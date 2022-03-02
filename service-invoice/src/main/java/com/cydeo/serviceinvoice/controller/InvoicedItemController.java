package com.cydeo.serviceinvoice.controller;

import com.cydeo.servicecommon.contract.InvoicedItemDto;
import com.cydeo.servicecommon.general.ResponseWrapper;
import com.cydeo.serviceinvoice.service.InvoicedItemService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/invoicedItems")
public class InvoicedItemController {

    private final InvoicedItemService invoicedItemService;

    public InvoicedItemController(InvoicedItemService invoicedItemService) {
        this.invoicedItemService = invoicedItemService;
    }

    @GetMapping("/all")
    public ResponseEntity<ResponseWrapper> getAll(){
        return ResponseEntity.ok(new ResponseWrapper("Invoiced items are retrieved", invoicedItemService.getAll()));
    }

    @GetMapping("/{invoicedItemId}")
    public ResponseEntity<ResponseWrapper> getById(@PathVariable("invoicedItemId") Long invoicedItemId){
        return ResponseEntity.ok(new ResponseWrapper("Invoiced item is retrieved", invoicedItemService.get(invoicedItemId)));
    }

    @PostMapping
    public ResponseEntity<ResponseWrapper> save(@RequestBody InvoicedItemDto invoicedItemDto){
        return ResponseEntity.ok(new ResponseWrapper("Invoiced item is created", invoicedItemService.create(invoicedItemDto)));
    }

    @PutMapping("/{invoicedItemId}")
    public ResponseEntity<ResponseWrapper> update(@RequestBody InvoicedItemDto invoicedItemDto, @PathVariable("invoicedItemId") Long invoicedItemId){
        return ResponseEntity.ok(new ResponseWrapper("Invoiced item is updated", invoicedItemService.update(invoicedItemDto, invoicedItemId)));
    }

    @DeleteMapping("/{invoicedItemId}")
    public ResponseEntity<Object> delete(@PathVariable("invoicedItemId") Long invoicedItemId){
        invoicedItemService.delete(invoicedItemId);
        return ResponseEntity.noContent().build();
    }


}
