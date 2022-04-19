package com.cydeo.servicecommon.contract;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {

    private Long id;
    private String firstName;
    private String lastName;
    private String companyName;
    private Long companyId;
    private String email;
    private String password;
    private Boolean enabled;
    private String phone;
    private RoleDto role;

}
