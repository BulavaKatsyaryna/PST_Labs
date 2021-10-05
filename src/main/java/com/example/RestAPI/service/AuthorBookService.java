package com.example.RestAPI.service;

import com.example.RestAPI.model.Author;
import com.example.RestAPI.model.AuthorBook;

import java.util.HashMap;
import java.util.List;

public interface AuthorBookService {

    AuthorBook getById(Long id);

    void save(AuthorBook authorBook);

    void delete(Long id);

    List<AuthorBook> getAll();

    HashMap<Long, Integer> calculateBookByAuthor();

    Author findTheBestAuthor();
}
