package com.example.RestAPI.controller;

import com.example.RestAPI.model.Book;
import com.example.RestAPI.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/controller/books/")
public class BookController {

    @Autowired
    private BookService bookService;

    @RequestMapping(value = "{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Book> getBook(@PathVariable("id") Long bookId) {
        if (bookId == null) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        Book book = this.bookService.getById(bookId);

        if (book == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(book, HttpStatus.OK);
    }

    @RequestMapping(value = "", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Book> saveBook(@RequestBody @Valid Book book) {
        HttpHeaders headers = new HttpHeaders();

        if (book == null) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

        this.bookService.save(book);
        return new ResponseEntity<>(book, headers, HttpStatus.CREATED);
    }
}
