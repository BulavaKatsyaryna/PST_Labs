package com.example.RestAPI.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Author extends MainEntity implements Comparable<Author>{

    @Column(name = "name")
    private String name;

    @Column(name = "gender")
    private String gender;

    @Column(name = "born")
    private String born;

    @Override
    public int compareTo(Author author) {
        if (getBorn() == null || author.getBorn() == null) {
            return 0;
        }
        return getBorn().compareTo(author.getBorn());
    }
}
