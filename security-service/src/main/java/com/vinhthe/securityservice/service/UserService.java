package com.vinhthe.securityservice.service;

import com.vinhthe.securityservice.dto.UserDto;
import com.vinhthe.securityservice.dto.UserRegistrationRequestDto;
import com.vinhthe.securityservice.exception.CustomException;

public interface UserService {
    UserDto createUser(UserRegistrationRequestDto userDto) throws CustomException;

    UserDto getUserById(Long id) throws CustomException;

    UserDto getUserByEmail(String email) throws CustomException;

    UserDto updateUser(UserRegistrationRequestDto userDto);

    void deleteUserById(Long id) throws CustomException;
}
