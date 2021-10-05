package com.example.RestAPI.Implementation;

import com.example.RestAPI.model.Author;
import com.example.RestAPI.model.AuthorBook;
import com.example.RestAPI.repository.AuthorBookRepo;
import com.example.RestAPI.repository.AuthorRepo;
import com.example.RestAPI.service.AuthorBookService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Slf4j
@Service
public class AuthorBookServiceImplementation implements AuthorBookService {

    @Autowired
    AuthorBookRepo authorBookRepo;

    @Autowired
    private AuthorBookService authorBookService;

    @Autowired
    AuthorRepo authorRepo;

    @Override
    public AuthorBook getById(Long id) {
        log.info("IN AuthorBookServiceImpl getById {}", id);
        return authorBookRepo.findOne(id);
    }

    @Override
    public void save(AuthorBook authorBook) {
        log.info("IN AuthorBookServiceImpl save {}", authorBook);
        authorBookRepo.save(authorBook);
    }

    @Override
    public void delete(Long id) {
        log.info("IN AuthorBookServiceImpl delete {}", id);
        authorBookRepo.delete(id);
    }

    @Override
    public List<AuthorBook> getAll() {
        log.info("IN AuthorBookServiceImpl getAll");
        return authorBookRepo.findAll();
    }

    @Override
    public HashMap<Long, Integer> calculateBookByAuthor() {
        log.info("IN AuthorBookServiceImpl calculateBooks");

        List<AuthorBook> allRecords = this.authorBookService.getAll();
        HashMap<Long, Integer> uniqueRecords = new HashMap<>();

        if (allRecords.isEmpty()) {
            log.info("There are no authors of books");
            return null;
        }

        for (AuthorBook authorBook : allRecords) {
            Long authorId = authorBook.getAuthor().getId();

            if (uniqueRecords.containsKey(authorId)) {
                int countOfBooks = uniqueRecords.get(authorId);
                uniqueRecords.put(authorId, countOfBooks + 1);
            } else {
                uniqueRecords.put(authorId, 1);
            }
        }

        return uniqueRecords;
    }

    @Override
    public Author findTheBestAuthor() {
        log.info("IN AuthorBookServiceImpl findTheBestAuthor");

        HashMap<Long, Integer> uniqueRecords = calculateBookByAuthor();

        Long theBestAuthor = 0L;
        int bestResult = 0;

        for (Map.Entry<Long, Integer> pair : uniqueRecords.entrySet()) {
            Long key = pair.getKey();
            int value = pair.getValue();

            if (value >= bestResult) {
                theBestAuthor = key;
                bestResult = value;
            }
        }

        return authorRepo.findOne(theBestAuthor);
    }
}
