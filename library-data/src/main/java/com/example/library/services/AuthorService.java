package com.example.library.services;

import com.example.library.model.Author;

import java.util.Set;

public interface AuthorService {
    Author findById(Long id);
    Author findByLastName(String lastName);
    Author save(Author author);
    Set<Author> findAll();
}
