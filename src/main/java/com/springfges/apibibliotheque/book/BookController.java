package com.springfges.apibibliotheque.book;

import net.bytebuddy.TypeCache;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.security.access.prepost.PostAuthorize;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import com.springfges.apibibliotheque.book.AgeChecker;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
import java.util.function.Predicate;

@RestController
@RequestMapping(path="api/book")

public class BookController {
    //@Autowired
    //private Book book;

    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private HttpSecurity http;

    @Autowired
    private AgeChecker ageChecker;

    @GetMapping("/{id}")
    @PostAuthorize("hasAuthority(\"SCOPE_adulte\")")
    public Optional<Book> getBook(@PathVariable("id") Integer id) {

        Optional<Book> book = bookRepository.findById(id);

        var x = book.get().getCategory();

        return bookRepository.findById(id);
    }

    @GetMapping("/search/{title}")
    public Optional<Book> searchBook(@PathVariable("title") String title) {
        return bookRepository.findByTitle(title);
    }

}