package com.project.first.shekhar.bachelor.den.services.impl;

import com.project.first.shekhar.bachelor.den.entities.User;
import com.project.first.shekhar.bachelor.den.exceptions.ResourceNotFoundException;
import com.project.first.shekhar.bachelor.den.payloads.UserDto;
import com.project.first.shekhar.bachelor.den.repositories.UserRepo;
import com.project.first.shekhar.bachelor.den.services.UserService;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class UserServiceImpl implements UserService {

    private UserRepo userRepo;
    @Override
    public UserDto createUser(UserDto userDto) {
        User user=this.dtoToUser(userDto);
        User savedUser=this.userRepo.save(user);
        return this.userToDto(savedUser);
    }

    @Override
    public UserDto updateUser(UserDto userDto, Integer userId) {
        User user=this.userRepo.findById(userId)
                        .orElseThrow(() -> new ResourceNotFoundException("user","id",userId));
        user.setName(userDto.getName());
        user.setPassword(userDto.getPassword());
        user.setEmail(userDto.getEmail());
        return this.userToDto(userRepo.save(user));
    }

    @Override
    public UserDto getUserById(Integer userId) {
        User user=this.userRepo.findById(userId)
                .orElseThrow(() -> new ResourceNotFoundException("user","id",userId));
        return userToDto(user);
    }

    @Override
    public List<UserDto> getAllUser() {
        List<User> users=userRepo.findAll();
        List<UserDto> userDtos= users.stream()
                .map(user ->this.userToDto(user)).collect(Collectors.toList());
        return userDtos;
    }

    @Override
    public void deleteUser(Integer userId) {
        User user=userRepo.findById(userId)
                .orElseThrow(() -> new ResourceNotFoundException("user","id",userId));;
        userRepo.delete(user);
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
