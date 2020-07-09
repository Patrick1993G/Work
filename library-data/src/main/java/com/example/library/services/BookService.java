package com.example.library.services;

import com.example.library.model.Author;
import com.example.library.model.Book;

import java.util.Set;

public interface BookService {
    Book findById(Long id);
    Book findByIsbn(Long isbn);
    Book findByTitle(String Title);
    Book save(Book book);
    Set<Book> findAll();
}
