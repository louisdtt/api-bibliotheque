package com.springfges.apibibliotheque.user;

import com.springfges.apibibliotheque.book.Book;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
public class Customer {

    @Id
    private int id;
    private String name;
    private int age;
    private String category;

    @OneToMany
    @JoinColumn(name = "customer_id")
    private Set<Book> borrow;
}
