package com.example.RestAPI.service;

import com.example.RestAPI.model.Author;

import java.util.List;

public interface AuthorService {

    Author getById(Long id);

    void delete(Long id);

    void save(Author author);

    List<Author> getAll();
}
