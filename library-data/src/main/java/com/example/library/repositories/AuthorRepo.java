package com.example.library.repositories;

import com.example.library.model.Author;
import com.example.library.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepo extends JpaRepository<Author,Long> {
}
