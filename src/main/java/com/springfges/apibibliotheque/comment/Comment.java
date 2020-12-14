package com.springfges.apibibliotheque.comment;

import com.springfges.apibibliotheque.book.Book;
import com.springfges.apibibliotheque.user.Customer;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@Data
@NoArgsConstructor
public class Comment {

    @Id
    private int id;
    private String content;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    @ManyToOne
    @JoinColumn(name = "book_id")
    private Book book;
}