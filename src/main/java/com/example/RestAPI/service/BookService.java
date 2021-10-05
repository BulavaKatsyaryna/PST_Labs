package com.example.RestAPI.service;

import com.example.RestAPI.model.AuthorBook;
import com.example.RestAPI.model.Book;

import java.util.List;

public interface BookService {

    Book getById(Long id);

    void delete(Long id);

    void save(Book customer);

    List<Book> getAll();

    List<AuthorBook> retrieveBooks(int count);
}
