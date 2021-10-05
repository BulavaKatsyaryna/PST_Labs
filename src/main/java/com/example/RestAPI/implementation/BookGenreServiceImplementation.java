package com.example.RestAPI.implementation;

import com.example.RestAPI.model.BookGenre;
import com.example.RestAPI.repository.BookGenreRepo;
import com.example.RestAPI.service.BookGenreService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class BookGenreServiceImplementation implements BookGenreService {

    @Autowired
    BookGenreRepo bookGenreRepo;

    @Override
    public BookGenre getById(Long id) {
        log.info("IN BookGenreServiceImpl getById {}", id);
        return bookGenreRepo.findOne(id);
    }

    @Override
    public List<BookGenre> getAll() {
        log.info("IN BookGenreServiceImpl getAll");
        return bookGenreRepo.findAll();
    }
}
