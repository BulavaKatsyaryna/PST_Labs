package com.example.RestAPI.implementation;

import com.example.RestAPI.model.AuthorBook;
import com.example.RestAPI.model.Book;
import com.example.RestAPI.model.BookGenre;
import com.example.RestAPI.repository.BookRepo;
import com.example.RestAPI.service.AuthorBookService;
import com.example.RestAPI.service.BookService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Slf4j
@Service
public class BookServiceImplementation implements BookService {

    @Autowired
    BookRepo bookRepo;

    @Autowired
    private AuthorBookService authorBookService;

    @Override
    public Book getById(Long id) {
        log.info("IN BookServiceImpl getById {}", id);
        return bookRepo.findOne(id);
    }

    @Override
    public void save(Book book) {
        log.info("IN BookServiceImpl save {}", book);
        bookRepo.save(book);
    }

    @Override
    public void delete(Long id) {
        log.info("IN BookServiceImpl delete {}", id);
        bookRepo.delete(id);
    }

    @Override
    public List<Book> getAll() {
        log.info("IN BookServiceImpl getAll");
        return bookRepo.findAll();
    }

    @Override
    public HashMap<String, Integer> calculateBookByGenre() {
        log.info("IN BookServiceImpl calculateBookByGenre");

        HashMap<String, Integer> resultRecords = new HashMap<>();
        List<Book> allRecords = bookRepo.findAll();

        for (Book book : allRecords) {
            BookGenre bookGenre = book.getBookGenre();

            if (resultRecords.containsKey(bookGenre)) {
                int countOfGenre = resultRecords.get(bookGenre);
                resultRecords.put(bookGenre.toString(), countOfGenre + 1);
            } else {
                resultRecords.put(bookGenre.toString(), 1);
            }
        }
        return resultRecords;
    }

    @Override
    public List<AuthorBook> returnBooks(int count) {
        log.info("IN BookServiceImpl returnBooks");

        List<AuthorBook> allAuthorBooks = authorBookService.getAll();
        List<AuthorBook> allAuthorBooksValid = new ArrayList<>();

        HashMap<Long, Integer> ratingAuthor = authorBookService.calculateBookByAuthor();
        HashMap<Long, Integer> ratingAuthorValid = new HashMap<>();

        for (HashMap.Entry<Long, Integer> pair : ratingAuthor.entrySet()) {
            Long key = pair.getKey();
            Integer value = pair.getValue();

            if (value > count) {
                ratingAuthorValid.put(key, value);
            }
        }


        for (HashMap.Entry<Long, Integer> pair : ratingAuthorValid.entrySet()) {
            Long key = pair.getKey();
            Integer value = pair.getValue();
        }


        for (AuthorBook pair : allAuthorBooks) {

            for (HashMap.Entry<Long, Integer> pairValid : ratingAuthorValid.entrySet()) {
                Long key = pairValid.getKey();
                if (key.equals(pair.getAuthor().getId())) {
                    allAuthorBooksValid.add(pair);
                }
            }
        }
        return allAuthorBooksValid;
    }
}
