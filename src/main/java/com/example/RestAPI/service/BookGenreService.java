package com.example.RestAPI.service;

import com.example.RestAPI.model.BookGenre;

import java.util.List;

public interface BookGenreService {

    BookGenre getById(Long id);

    List<BookGenre> getAll();
}
