package com.cydeo.serviceproduct.dto;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Where;

import javax.persistence.*;


@AllArgsConstructor
@NoArgsConstructor
@Data
@JsonIgnoreProperties(value = {"hibernateLazyInitializer"},ignoreUnknown = true)
public class CategoryDto {



    private Long id;
    private Long companyId;
    private boolean enable;
    private String description;

    @JsonProperty("product")
    @JsonIgnore
    private ProductDto productDto;
}
