package com.example.RestAPI.Implementation;

import com.example.RestAPI.model.BookGenre;
import com.example.RestAPI.repository.BookGenreRepo;
import com.example.RestAPI.service.BookGenreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookGenreServiceImplementation implements BookGenreService {

    @Autowired
    BookGenreRepo bookGenreRepo;

    @Override
    public BookGenre getById(Long id) {
        return null;
    }

    @Override
    public List<BookGenre> getAll() {
        return null;
    }
}
