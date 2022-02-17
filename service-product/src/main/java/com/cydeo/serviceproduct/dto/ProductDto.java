package com.cydeo.serviceproduct.dto;

import com.cydeo.serviceproduct.enums.ProductStatus;
import com.cydeo.serviceproduct.enums.Unit;

public class ProductDto {

    private Long id;
    private String name;
    private String description;
    private long categoryId;
    private int qty;
    private int price;
    private Unit unit;
    private int lowLimitAlert;
    private int tax;
    private Long companyId;
    private Byte enabled;
    private ProductStatus productStatus;
}
