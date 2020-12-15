package com.springfges.apibibliotheque.book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping(path="/book")

public class BookController {
    @Autowired
    private BookRepository bookRepository;

    @GetMapping("search/{title}")
    public Optional<Book> getBook(@PathVariable("title") String title){
        return bookRepository.findByTitle(title);
    }
}