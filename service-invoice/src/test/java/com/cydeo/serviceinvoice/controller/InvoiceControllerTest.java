package com.cydeo.serviceinvoice.controller;

import static org.mockito.Mockito.when;

import com.cydeo.servicecommon.contract.InvoiceDto;
import com.cydeo.serviceinvoice.entity.Invoice;
import com.cydeo.serviceinvoice.enums.InvoiceStatus;
import com.cydeo.serviceinvoice.enums.InvoiceType;
import com.cydeo.serviceinvoice.service.InvoiceService;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@ContextConfiguration(classes = {InvoiceController.class})
@ExtendWith(SpringExtension.class)
class InvoiceControllerTest {
    @Autowired
    private InvoiceController invoiceController;

    @MockBean
    private InvoiceService invoiceService;

    @Test
    void testGetAll() throws Exception {

        InvoiceDto invoice = new InvoiceDto();
        invoice.setDate(LocalDate.ofEpochDay(1L));
        invoice.setEnabled(true);
        invoice.setClientVendorId(123L);
        invoice.setCompanyId(123L);
        invoice.setId(123L);
        invoice.setInvoiceType("Purchase");
        invoice.setInvoiceNo("Invoice No");
        invoice.setInvoiceStatus("Approved");

        ArrayList<InvoiceDto> invoiceList = new ArrayList<>();
        invoiceList.add(invoice);
        ObjectMapper objectMapper = new ObjectMapper();
        String json = objectMapper.writeValueAsString(invoice);
        when(this.invoiceService.getAll()).thenReturn(invoiceList);
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/api/v1/invoices/all");
        MockMvcBuilders.standaloneSetup(this.invoiceController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content()
                        .string("{\"success\":true,\"message\":\"Invoices are retrieved\",\"code\":200,\"data\":["+json+"]}"));
    }
}

