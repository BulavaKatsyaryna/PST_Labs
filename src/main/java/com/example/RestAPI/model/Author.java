package com.example.RestAPI.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Author implements Comparable<Author>{

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Override
    public int compareTo(Author o) {
        if (getLastName() == null || o.getLastName() == null) {
            return 0;
        }
        return getLastName().compareTo(o.lastName);
    }
}
