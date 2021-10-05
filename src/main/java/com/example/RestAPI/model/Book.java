package com.example.RestAPI.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book {

    @Column(name = "name")
    private String name;

    @ManyToOne
    @JoinColumn(name = "bookGenre_id")
    private BookGenre bookGenre;

    @Column(name = "published")
    private String published;

    @Column(name = "rating")
    private String rating;
}
