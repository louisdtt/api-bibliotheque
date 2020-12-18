package com.springfges.apibibliotheque.user;

import com.springfges.apibibliotheque.book.Book;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
public class Customer {

    @Id
    private int id;
    private String name;
    private int age;

    @Column(unique = true)
    private String login;
    private String password;
    private String category;

    @OneToMany
    @JoinColumn(name = "customer_id")
    private Set<Book> borrow;
}
