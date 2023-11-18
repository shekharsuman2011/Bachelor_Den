package com.project.first.shekhar.bachelor.den.controllers;

import com.project.first.shekhar.bachelor.den.payloads.UserDto;
import com.project.first.shekhar.bachelor.den.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.fasterxml.jackson.databind.type.LogicalType.Map;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;
    @PostMapping("/")
    public ResponseEntity<UserDto> createUser(@RequestBody UserDto userDto)
    {
        UserDto createdUserDto=userService.createUser(userDto);
        return new ResponseEntity<>(createdUserDto,HttpStatus.CREATED);
    }

    @GetMapping("/{UserId}")
    public ResponseEntity<UserDto> getUserById(@PathVariable Integer UserId)
    {
        return ResponseEntity.ok(userService.getUserById(UserId));
    }

    @GetMapping("/")
    public ResponseEntity<List<UserDto>> getUsers()
    {
        return ResponseEntity.ok(userService.getAllUser());
    }

    @DeleteMapping("/{UserId}")
    public ResponseEntity<?> deleteUser(@PathVariable Integer UserId)
    {
        userService.deleteUser(UserId);
        return new ResponseEntity(HttpStatus.OK);
    }

    @PutMapping("/{UserId}")
    public ResponseEntity<UserDto> updateUser(@RequestBody UserDto userDto ,@PathVariable Integer UserId)
    {
        UserDto updatedUser=userService.updateUser(userDto,UserId);
        return ResponseEntity.ok(updatedUser);
    }

}
