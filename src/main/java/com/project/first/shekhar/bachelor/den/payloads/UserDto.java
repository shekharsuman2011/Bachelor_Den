package com.project.first.shekhar.bachelor.den.payloads;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class UserDto {
    private int ID;
    private String name;
    private String email;
    private String password;
}
