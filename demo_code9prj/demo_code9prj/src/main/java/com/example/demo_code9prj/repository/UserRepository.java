package com.example.demo_code9prj.repository;

import com.example.demo_code9prj.models.User;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserRepository extends CrudRepository<User,String> {

    Optional<User> findByUsername(String username);
}
