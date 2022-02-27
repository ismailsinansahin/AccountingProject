package com.cydeo.serviceproduct.dto;

import com.cydeo.serviceproduct.enums.ProductStatus;
import com.cydeo.serviceproduct.enums.Unit;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties (value = {"hibernateLazyInitializer"},ignoreUnknown = true)
public class ProductDto implements Serializable {



    private Long id;
    private String productName;
    private String description;
    private Long categoryId;
    private int qty;
    private int price;
    private Unit unit;
    private int lowLimitAlert;
    private int tax;
    private Long companyId;
    private Byte enabled;
    private ProductStatus productStatus;
    private boolean isDeleted= false;

}
