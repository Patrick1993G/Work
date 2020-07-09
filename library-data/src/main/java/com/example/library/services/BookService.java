package com.example.library.services;
import com.example.library.model.Book;

import java.util.Set;

public interface BookService extends CrudService<Book,Long>{
    Book findByIsbn(Long isbn);
    Book findByTitle(String Title);
}
