package com.springfges.apibibliotheque.comment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping(path="api/comment")

public class CommentController {
    @Autowired
    private CommentRepository commentRepository;

    @GetMapping("/search/{title}")
    public Optional<Comment> getComment(@PathVariable("title") String title){
        return commentRepository.findByTitle(title);
    }
}
