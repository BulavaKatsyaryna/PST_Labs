package com.example.RestAPI.service;

import com.example.RestAPI.model.AuthorBook;
import com.example.RestAPI.model.Book;

import java.util.HashMap;
import java.util.List;

public interface BookService {

    Book getById(Long id);

    void save(Book customer);

    void delete(Long id);

    List<Book> getAll();

    HashMap<String, Integer> calculateBookByGenre();

    List<AuthorBook> returnBooks(int count);
}
