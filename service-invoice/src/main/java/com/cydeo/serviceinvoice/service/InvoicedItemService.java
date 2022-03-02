package com.cydeo.serviceinvoice.service;

import com.cydeo.servicecommon.contract.InvoiceDto;
import com.cydeo.servicecommon.contract.InvoicedItemDto;

import java.util.List;

public interface InvoicedItemService {

    List<InvoicedItemDto> getAll();

    InvoicedItemDto get(Long invoicedItemId);

    InvoicedItemDto create(InvoicedItemDto invoicedItemDto);

    InvoicedItemDto update(InvoicedItemDto invoicedItemDto, Long invoicedItemId);

    void delete(Long invoicedItemId);

}
