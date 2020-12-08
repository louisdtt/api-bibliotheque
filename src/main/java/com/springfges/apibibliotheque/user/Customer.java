package com.springfges.apibibliotheque.user;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
public class Customer {

    @Id
    private int id;
    private String name;
}
