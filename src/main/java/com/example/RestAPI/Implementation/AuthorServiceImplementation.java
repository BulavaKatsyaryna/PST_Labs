package com.example.RestAPI.Implementation;

import com.example.RestAPI.model.Author;
import com.example.RestAPI.repository.AuthorRepo;
import com.example.RestAPI.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorServiceImplementation implements AuthorService {

    @Autowired
    AuthorRepo authorRepo;

    @Override
    public Author getById(Long id) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public void save(Author author) {

    }

    @Override
    public List<Author> getAll() {
        return null;
    }
}
