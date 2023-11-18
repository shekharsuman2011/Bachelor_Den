package com.project.first.shekhar.bachelor.den.services.impl;

import com.project.first.shekhar.bachelor.den.entities.User;
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

    User dtoToUser(UserDto userDto)
    {
        User user=new User();
        user.setID(userDto.getID());
        user.setName(userDto.getName());
        user.setPassword(userDto.getPassword());
        user.setEmail(userDto.getEmail());
        return user;
    }

    UserDto userToDto(User user)
    {
        UserDto userDto=new UserDto();
        userDto.setID(user.getID());
        userDto.setName(user.getName());
        userDto.setPassword(user.getPassword());
        userDto.setEmail(user.getEmail());
        return userDto;
    }
}
