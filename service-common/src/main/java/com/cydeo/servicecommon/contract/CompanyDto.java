package com.cydeo.servicecommon.contract;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CompanyDto {

    private Long id;

    private String name;

    private String address1;
    private String address2;

    private String stateName;

    private String zipCode;

    private String representative;

    private String email;

    private String phone;

    private LocalDate establishmentDate;

    private Boolean enabled;

    private String companyStatus;

}
