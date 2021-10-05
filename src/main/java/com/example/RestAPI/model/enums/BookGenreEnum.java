package com.example.RestAPI.model.enums;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public enum BookGenreEnum {

    TECHNICAL(1L, "Technical"),
    EDUCATION(2L, "Education"),
    HISTORICAL(3L, "Historical"),
    FANTASY(4L, "Fantasy"),
    CRIME(5L, "Crime"),
    NOVEL(6L, "Novel");

    public Long id;
    public String name;
}
