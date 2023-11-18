package com.project.first.shekhar.bachelor.den.services;

import com.project.first.shekhar.bachelor.den.payloads.UserDto;

import java.util.List;

public interface UserService {

    UserDto createUser(UserDto user);
    UserDto updateUser(UserDto user,Integer Id);
    UserDto getUserById(Integer Id);
    List<UserDto> getAllUser();

    void deleteUser(Integer Id);
}
