package com.cydeo.servicecommon.contract;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
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

    @JsonProperty("category")
    private  Long categoryId;
    private int qty;
    private int price;
    private String unit;
    private int lowLimitAlert;
    private int tax;
    private Long companyId;
    private Boolean enabled;
    private String productStatus;

}
