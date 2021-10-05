package com.example.RestAPI.Implementation;

import com.example.RestAPI.model.Author;
import com.example.RestAPI.model.AuthorBook;
import com.example.RestAPI.repository.AuthorBookRepo;
import com.example.RestAPI.repository.AuthorRepo;
import com.example.RestAPI.service.AuthorBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class AuthorBookServiceImplementation implements AuthorBookService {

    @Autowired
    AuthorBookRepo authorBookRepo;

    @Autowired
    AuthorRepo authorRepo;

    @Autowired
    private AuthorBookService authorBookService;

    @Override
    public AuthorBook getById(Long id) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public void save(AuthorBook authorBook) {

    }

    @Override
    public List<AuthorBook> getAll() {
        return null;
    }

    @Override
    public Author FindBookByPublicationYear() {
        return null;
    }

    @Override
    public HashMap<Long, Integer> calculateBookByAuthor() {
        return null;
    }
}
