package com.example.library.repositories;

import com.example.library.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepo extends JpaRepository<Book,Long> {
    Book findByIsbn(Long isbn);
}
