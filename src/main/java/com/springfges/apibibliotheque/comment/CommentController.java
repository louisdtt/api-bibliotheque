package com.springfges.apibibliotheque.comment;

import com.springfges.apibibliotheque.book.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path="api/comment")

public class CommentController {
    @Autowired
    private CommentRepository commentRepository;

    @GetMapping
    public List<Comment> getComments() {
        return commentRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Comment> getCommentById(@PathVariable("id") Integer id) {
        return commentRepository.findById(id);
    }

    @GetMapping("/search/{title}")
    public Optional<Comment> getCommentByTitle(@PathVariable("title") String title){
        return commentRepository.findByTitle(title);
    }
}
