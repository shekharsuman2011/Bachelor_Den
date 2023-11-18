package com.project.first.shekhar.bachelor.den.repositories;

import com.project.first.shekhar.bachelor.den.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Integer> {
}
