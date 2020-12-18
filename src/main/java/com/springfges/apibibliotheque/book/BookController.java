package com.springfges.apibibliotheque.book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PostAuthorize;
import org.springframework.web.bind.annotation.*;
import java.util.Optional;

@RestController
@RequestMapping(path="api/book")

public class BookController {
    @Autowired
    private BookRepository bookRepository;

    @GetMapping("/{id}")
    @PostAuthorize("hasAuthority('SCOPE_' + returnObject.get().getCategory())")
    public Optional<Book> getBook(@PathVariable("id") Integer id) {
        return bookRepository.findById(id);
    }

    @GetMapping("/search/{title}")
    @PostAuthorize("hasAuthority('SCOPE_' + returnObject.get().getCategory())")
    public Optional<Book> searchBook(@PathVariable("title") String title) {
        return bookRepository.findByTitle(title);
    }
}
