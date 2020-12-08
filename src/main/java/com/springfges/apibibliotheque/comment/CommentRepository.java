package com.springfges.apibibliotheque.comment;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path="comment")
public interface CommentRepository  extends JpaRepository<Comment, Integer>{
}
