package com.example.demo_code9prj.controler;

import com.example.demo_code9prj.models.Book;
import com.example.demo_code9prj.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    private BookRepository bookRepository;

    @GetMapping("/books")
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    @GetMapping("/books")
    public List<Book> getTopSeller() {
        return bookRepository.findBestSellers();
    }
}
