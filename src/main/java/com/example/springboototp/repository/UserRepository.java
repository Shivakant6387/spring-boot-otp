package com.example.springboototp.repository;

import com.example.springboototp.model.UserPojo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserPojo,String> {
    UserPojo findByUsername(String username);
}
