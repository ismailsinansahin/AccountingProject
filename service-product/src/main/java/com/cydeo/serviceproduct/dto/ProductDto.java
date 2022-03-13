package com.cydeo.serviceproduct.dto;

import com.cydeo.serviceproduct.enums.ProductStatus;
import com.cydeo.serviceproduct.enums.Unit;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.UniqueConstraint;
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
    @JsonProperty("category")
    private  CategoryDto categoryDto;
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
