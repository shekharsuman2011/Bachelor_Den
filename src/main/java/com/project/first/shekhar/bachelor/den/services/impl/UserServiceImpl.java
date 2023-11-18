package com.project.first.shekhar.bachelor.den.services.impl;

import com.project.first.shekhar.bachelor.den.payloads.UserDto;
import com.project.first.shekhar.bachelor.den.repositories.UserRepo;
import com.project.first.shekhar.bachelor.den.services.UserService;

import java.util.List;

public class UserServiceImpl implements UserService {

    private UserRepo userRepo;
    @Override
    public UserDto createUser(UserDto user) {
        return null;
    }

    @Override
    public UserDto updateUser(UserDto user, Integer Id) {
        return null;
    }

    @Override
    public UserDto getUserById(Integer Id) {
        return null;
    }

    @Override
    public List<UserDto> getAllUser() {
        return null;
    }

    @Override
    public void deleteUser(Integer Id) {

    }
}
