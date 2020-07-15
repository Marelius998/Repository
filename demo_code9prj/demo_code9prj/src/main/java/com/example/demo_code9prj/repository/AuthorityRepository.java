package com.example.demo_code9prj.repository;

import com.example.demo_code9prj.models.Author;
import com.example.demo_code9prj.models.Authority;
import org.springframework.data.repository.CrudRepository;

public interface AuthorityRepository extends CrudRepository<Author, String> {
    Authority getOne(String username);
}
