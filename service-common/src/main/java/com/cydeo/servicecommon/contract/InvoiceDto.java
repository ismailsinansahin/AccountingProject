package com.cydeo.servicecommon.contract;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class InvoiceDto {

    Long id;
    private String invoiceNo;
    private String invoiceStatus;
    private String invoiceType;
    @DateTimeFormat
    private LocalDate date;
    private boolean enabled;
    private Long companyId;
    private Long clientVendorId;

//    @ManyToOne
//    private InvoiceProductRel invoiceProductRel;

}
