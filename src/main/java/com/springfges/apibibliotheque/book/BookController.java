package com.springfges.apibibliotheque.book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PostAuthorize;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.web.bind.annotation.*;
import java.util.Optional;

@RestController
@RequestMapping(path="api/book")

public class BookController {

    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private HttpSecurity http;

    @Autowired
    private AgeChecker ageChecker;

    @GetMapping("/{id}")
    @PostAuthorize("hasAuthority(\"SCOPE_adulte\")")
    public Optional<Book> getBook(@PathVariable("id") Integer id) {
        return bookRepository.findById(id);
    }

    @GetMapping("/search/{title}")
    public Optional<Book> searchBook(@PathVariable("title") String title) {
        return bookRepository.findByTitle(title);
    }
}
