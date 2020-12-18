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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Set<Book> getBorrow() {
        return borrow;
    }

    public void setBorrow(Set<Book> borrow) {
        this.borrow = borrow;
    }

    private String category;

    @OneToMany
    @JoinColumn(name = "customer_id")
    private Set<Book> borrow;
}
