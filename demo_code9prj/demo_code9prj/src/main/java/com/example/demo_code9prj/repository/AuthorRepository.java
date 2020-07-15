package com.example.demo_code9prj.repository;

import com.example.demo_code9prj.models.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author,Long> {
}
