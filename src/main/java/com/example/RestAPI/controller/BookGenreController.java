package com.example.RestAPI.controller;

import com.example.RestAPI.model.BookGenre;
import com.example.RestAPI.service.BookGenreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/controller/books/genre/")
public class BookGenreController {

    @Autowired
    private BookGenreService bookGenreService;

    @RequestMapping(value = "{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<BookGenre> getBookGenre(@PathVariable("id") Long bookGenreId) {
        if (bookGenreId == null) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        BookGenre bookGenre = this.bookGenreService.getById(bookGenreId);

        if (bookGenre == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(bookGenre, HttpStatus.OK);
    }

    @RequestMapping(value = "", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<BookGenre>> getAllBookGenres() {
        List<BookGenre> bookGenres = this.bookGenreService.getAll();

        if (bookGenres.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(bookGenres, HttpStatus.OK);
    }
}
