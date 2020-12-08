package com.springfges.apibibliotheque.book;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor

public class Book {

    @Id
    private int id;
    private String title;
    private String category;
}
