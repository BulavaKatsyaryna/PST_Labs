package com.example.RestAPI.model.enums;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public enum BookGenreEnum {

    NOVEL(1L, "Novel"),
    FANTASY(2L, "Fantasy"),
    HISTORICAL(3L, "Historical"),
    DETECTIVE(3L, "Detective"),
    CHILDREN(4L, "Children");

    public Long id;
    public String name;
}
