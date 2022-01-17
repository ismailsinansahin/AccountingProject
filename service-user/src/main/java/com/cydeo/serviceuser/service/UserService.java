package com.cydeo.serviceuser.service;

import com.cydeo.servicecommon.contract.UserDto;

import java.util.List;

public interface UserService {

    List<UserDto> getAll();

    UserDto get(Long id);

    UserDto create(UserDto userDto);

    UserDto update(UserDto userDto);

    void delete(Long id);

}
