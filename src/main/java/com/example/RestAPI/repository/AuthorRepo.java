package com.example.RestAPI.repository;

import com.example.RestAPI.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepo  extends JpaRepository<Author, Long> {
}
