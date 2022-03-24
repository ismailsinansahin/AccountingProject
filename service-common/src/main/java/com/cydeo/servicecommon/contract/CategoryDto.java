package com.cydeo.servicecommon.contract;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;





@AllArgsConstructor
@NoArgsConstructor
@Data
@JsonIgnoreProperties(value = {"hibernateLazyInitializer"},ignoreUnknown = true)
public class CategoryDto {



    private Long id;
    private Long companyId;
    private boolean enable;
    private String description;

    @JsonIgnoreProperties
    @JsonProperty("product")
     private ProductDto productId;
}
