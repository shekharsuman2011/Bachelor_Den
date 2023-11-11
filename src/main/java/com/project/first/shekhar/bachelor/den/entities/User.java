package com.project.first.shekhar.bachelor.den.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import jakarta.persistence.*;

@Entity
@Table(name = "users")
@NoArgsConstructor
@Getter
@Setter
public class User {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int ID;
    @Column(name="user_name",nullable=false)
    private String name;
    private String email;
    private String password;


}
