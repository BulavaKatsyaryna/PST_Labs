package com.example.RestAPI.service;

import com.example.RestAPI.model.Author;
import org.springframework.expression.ParseException;

import java.util.List;

public interface AuthorService {

    Author getById(Long id);

    void save(Author author);

    void delete(Long id);

    List<Author> getAll();

    List<Author> getAllByYear(byte year) throws ParseException;
}
