package com.example.library.services;
import com.example.library.bookApi.v1.model.BookDTO;
import com.example.library.model.Book;

import java.util.Arrays;
import java.util.List;

public interface BookService{
    BookDTO findByIsbn(Long isbn);
    BookDTO findByTitle(String Title);
    List<BookDTO> getAllBooks();
}
