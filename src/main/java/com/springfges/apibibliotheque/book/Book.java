package com.springfges.apibibliotheque.book;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.Id;

@Component
@Entity
@Data
@NoArgsConstructor

public class Book {

    @Id
    private int id;
    private String title;
    private String category;
    private String author;
    private String cover;
}
