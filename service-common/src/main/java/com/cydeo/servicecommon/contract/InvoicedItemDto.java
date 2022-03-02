package com.cydeo.servicecommon.contract;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class InvoicedItemDto {

    Long id;
    private BigDecimal unitPrice;
    private int qty;
    private int tax;
    private int profitLoss;
    private int purchasePrice;
    private int purchaseTax;
    private int purchaseCost;
    private int saledPrice;
    private int saledTax;
    private int saledAmount;
    private boolean enabled;
    private boolean temporary;

//    @ManyToOne
//    private InvoiceProductRel invoiceProductRel;

}
