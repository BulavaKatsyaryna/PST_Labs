package com.example.RestAPI.repository;

import com.example.RestAPI.model.AuthorBook;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorBookRepo extends JpaRepository<AuthorBook, Long> {

}
