package com.cydeo.servicecommon.contract;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(value = {"hibernateLazyInitializer"},ignoreUnknown = true)
public class ReportDto {

    private Long id;

    @JsonProperty("i_date")
    private LocalDate invoiceDate;

    private int price;
    private int quantity;
    private int remainingQuantity;

    @JsonProperty("product_id")
    private Long product;
}
