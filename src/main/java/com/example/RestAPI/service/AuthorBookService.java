package com.example.RestAPI.service;

import com.example.RestAPI.model.Author;
import com.example.RestAPI.model.AuthorBook;

import java.util.HashMap;
import java.util.List;

public interface AuthorBookService {

    AuthorBook getById(Long id);

    void delete(Long id);

    void save(AuthorBook authorBook);

    List<AuthorBook> getAll();

    Author FindBookByPublicationYear();

    HashMap<Long, Integer> calculateBookByAuthor();
}
