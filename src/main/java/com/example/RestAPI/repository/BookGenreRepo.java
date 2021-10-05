package com.example.RestAPI.repository;

import com.example.RestAPI.model.BookGenre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookGenreRepo extends JpaRepository<BookGenre, Long> {
}
