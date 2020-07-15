package com.example.demo_code9prj.repository;

import com.example.demo_code9prj.models.Book;
import com.example.demo_code9prj.models.Genre;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface GenreRepository extends CrudRepository<Genre, Long> {
    List<Genre> findAllByBooks(Book book);
}
