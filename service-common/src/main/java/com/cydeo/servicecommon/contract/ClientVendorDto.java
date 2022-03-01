package com.cydeo.servicecommon.contract;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ClientVendorDto {

    private Long id;

    private String companyName;

    private String phone;

    private String email;

    private Long companyId;

    private String type;

    private String zipCode;

    private String address;

    private String state;

    private Boolean enabled;

}
