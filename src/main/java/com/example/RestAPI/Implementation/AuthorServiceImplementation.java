package com.example.RestAPI.Implementation;

import com.example.RestAPI.model.Author;
import com.example.RestAPI.repository.AuthorRepo;
import com.example.RestAPI.service.AuthorService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.expression.ParseException;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.*;

@Slf4j
@Service
public class AuthorServiceImplementation implements AuthorService {

    @Autowired
    AuthorRepo authorRepo;

    @Override
    public Author getById(Long id) {
        log.info("IN AuthorServiceImpl getById {}", id);
        return authorRepo.findOne(id);
    }

    @Override
    public void save(Author author) {
        log.info("IN AuthorServiceImpl save {}", author);
        authorRepo.save(author);
    }

    @Override
    public void delete(Long id) {
        log.info("IN AuthorServiceImpl delete {}", id);
        authorRepo.delete(id);
    }

    @Override
    public List<Author> getAll() {
        log.info("IN AuthorServiceImpl getAll");
        return authorRepo.findAll();
    }

    @Override
    public List<Author> getAllByYear(byte year) throws ParseException {
        log.info("IN AuthorServiceImpl getAllByYear {}", year);

        List<Author> authorList = authorRepo.findAll();
        return findAuthorsOlderThan(authorList, year);
    }


    private static Integer calculateAge(Date birthday) {
        Calendar dob = Calendar.getInstance();
        Calendar today = Calendar.getInstance();

        dob.setTime(birthday);
        // include day of birth
        dob.add(Calendar.DAY_OF_MONTH, -1);

        int age = today.get(Calendar.YEAR) - dob.get(Calendar.YEAR);
        if (today.get(Calendar.DAY_OF_YEAR) <= dob.get(Calendar.DAY_OF_YEAR)) {
            age--;
        }
        return age;
    }

    private static List<Author> findAuthorsOlderThan(List<Author> authorList, byte year) throws ParseException, java.text.ParseException {
        log.info("IN AuthorServiceImpl findAuthorsOlderThan()");

        for (Iterator<Author> iter = authorList.listIterator(); iter.hasNext(); ) {
            Author a = iter.next();

            String sBorn = a.getBorn();
            Date born = new SimpleDateFormat("yyyy-MM-dd").parse(sBorn);
            int authorAge = calculateAge(born);

            if (authorAge <= year) {
                iter.remove();
            }
        }

        Collections.sort(authorList);
        return authorList;
    }
}
