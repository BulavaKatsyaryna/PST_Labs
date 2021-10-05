package com.example.RestAPI.Implementation;

import com.example.RestAPI.model.AuthorBook;
import com.example.RestAPI.model.Book;
import com.example.RestAPI.repository.BookRepo;
import com.example.RestAPI.service.AuthorBookService;
import com.example.RestAPI.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImplementation implements BookService {

    @Autowired
    BookRepo bookRepo;

    @Autowired
    private AuthorBookService authorBookService;

    @Override
    public Book getById(Long id) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public void save(Book customer) {

    }

    @Override
    public List<Book> getAll() {
        return null;
    }

    @Override
    public List<AuthorBook> retrieveBooks(int count) {
        return null;
    }
}
