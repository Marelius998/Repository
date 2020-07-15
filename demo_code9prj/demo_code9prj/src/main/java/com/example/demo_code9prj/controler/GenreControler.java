package com.example.demo_code9prj.controler;

import com.example.demo_code9prj.models.Book;
import com.example.demo_code9prj.models.Genre;
import com.example.demo_code9prj.repository.BookRepository;
import com.example.demo_code9prj.repository.GenreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/genres")
public class GenreControler {

    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private GenreRepository genreRepository;

    @GetMapping("/genres")
    public List<Genre> getGenres() {
        return (List<Genre>) genreRepository.findAll();
    }

    @GetMapping("/{genreId}")
    public List<Book> getBooksByGenre(@PathVariable int genreId)
    {
        return bookRepository.findByGenre(genreId);
    }

}
