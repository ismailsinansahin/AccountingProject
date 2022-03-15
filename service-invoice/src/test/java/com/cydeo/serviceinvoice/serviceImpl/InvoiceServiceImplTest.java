package com.cydeo.serviceinvoice.serviceImpl;

import com.cydeo.servicecommon.contract.InvoiceDto;
import com.cydeo.serviceinvoice.entity.Invoice;
import com.cydeo.serviceinvoice.enums.InvoiceStatus;
import com.cydeo.serviceinvoice.enums.InvoiceType;
import com.cydeo.serviceinvoice.mapper.MapperUtil;
import com.cydeo.serviceinvoice.repository.InvoiceRepository;

import java.time.LocalDate;
import java.time.LocalDateTime;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ContextConfiguration(classes = {InvoiceServiceImpl.class})
@ExtendWith(SpringExtension.class)
class InvoiceServiceImplTest {

    @MockBean
    private InvoiceRepository invoiceRepository;

    @Autowired
    private InvoiceServiceImpl invoiceServiceImpl;

    @MockBean
    private MapperUtil mapperUtil;

    @Test
    void getAll() {
    }

    @Test
    void get() {
    }

    @Test
    void getByInvoiceNo() {
    }

    @Test
    void create() {
    }

    @Test
    void update() {
    }

    @Test
    void delete() {
    }

    @Test
    void testGetAll() {
        when(this.invoiceRepository.findAll()).thenReturn(new ArrayList<>());
        assertTrue(this.invoiceServiceImpl.getAll().isEmpty());
        verify(this.invoiceRepository).findAll();
    }

    @Test
    void testGetAll2() {
        when(this.mapperUtil.convert((Object) any(), (Object) any())).thenReturn(new InvoiceDto());

        Invoice invoice = new Invoice();
        invoice.setDate(LocalDate.ofEpochDay(1L));
        invoice.setLastUpdateUserId(123L);
        invoice.setEnabled(true);
        invoice.setLastUpdateDateTime(LocalDateTime.of(1, 1, 1, 1, 1));
        invoice.setClientVendorId(123L);
        invoice.setCompanyId(123L);
        invoice.setInsertUserId(123L);
        invoice.setIsDeleted(true);
        invoice.setId(123L);
        invoice.setInvoiceType(InvoiceType.PURCHASE);
        invoice.setInvoiceNo("Invoice No");
        invoice.setInvoiceStatus(InvoiceStatus.APPROVED);
        invoice.setInsertDateTime(LocalDateTime.of(1, 1, 1, 1, 1));

        ArrayList<Invoice> invoiceList = new ArrayList<>();
        invoiceList.add(invoice);
        when(this.invoiceRepository.findAll()).thenReturn(invoiceList);
        assertEquals(1, this.invoiceServiceImpl.getAll().size());
        verify(this.mapperUtil).convert((Object) any(), (Object) any());
        verify(this.invoiceRepository).findAll();
    }

    @Test
    void testGetAll3() {
        when(this.mapperUtil.convert((Object) any(), (Object) any())).thenReturn(new InvoiceDto());

        Invoice invoice = new Invoice();
        invoice.setDate(LocalDate.ofEpochDay(1L));
        invoice.setLastUpdateUserId(123L);
        invoice.setEnabled(true);
        invoice.setLastUpdateDateTime(LocalDateTime.of(1, 1, 1, 1, 1));
        invoice.setClientVendorId(123L);
        invoice.setCompanyId(123L);
        invoice.setInsertUserId(123L);
        invoice.setIsDeleted(true);
        invoice.setId(123L);
        invoice.setInvoiceType(InvoiceType.PURCHASE);
        invoice.setInvoiceNo("Invoice No");
        invoice.setInvoiceStatus(InvoiceStatus.APPROVED);
        invoice.setInsertDateTime(LocalDateTime.of(1, 1, 1, 1, 1));

        Invoice invoice1 = new Invoice();
        invoice1.setDate(LocalDate.ofEpochDay(1L));
        invoice1.setLastUpdateUserId(123L);
        invoice1.setEnabled(true);
        invoice1.setLastUpdateDateTime(LocalDateTime.of(1, 1, 1, 1, 1));
        invoice1.setClientVendorId(123L);
        invoice1.setCompanyId(123L);
        invoice1.setInsertUserId(123L);
        invoice1.setIsDeleted(true);
        invoice1.setId(123L);
        invoice1.setInvoiceType(InvoiceType.PURCHASE);
        invoice1.setInvoiceNo("Invoice No");
        invoice1.setInvoiceStatus(InvoiceStatus.APPROVED);
        invoice1.setInsertDateTime(LocalDateTime.of(1, 1, 1, 1, 1));

        ArrayList<Invoice> invoiceList = new ArrayList<>();
        invoiceList.add(invoice1);
        invoiceList.add(invoice);
        when(this.invoiceRepository.findAll()).thenReturn(invoiceList);
        assertEquals(2, this.invoiceServiceImpl.getAll().size());
        verify(this.mapperUtil, atLeast(1)).convert((Object) any(), (Object) any());
        verify(this.invoiceRepository).findAll();
    }
}