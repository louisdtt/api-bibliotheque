package com.springfges.apibibliotheque.comment;

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
    @JoinColumn(name = "marque_id")
    private User marque;
}