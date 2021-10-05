package com.example.RestAPI.repository;

import com.example.RestAPI.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepo extends JpaRepository<Book, Long> {
}
