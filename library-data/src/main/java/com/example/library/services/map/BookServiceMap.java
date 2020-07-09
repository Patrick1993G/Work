package com.example.library.services.map;

import com.example.library.model.Author;
import com.example.library.model.Book;
import com.example.library.services.CrudService;

import java.util.Set;

public class BookServiceMap extends AbstractMapService<Book,Long> implements CrudService<Book,Long> {
    @Override
    public Set<Book> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public Book save(Book obj) {
        return super.save(obj.getId(),obj);
    }

    @Override
    public void delete(Book obj) {
        super.delete(obj);
    }

    @Override
    public Book findById(Long id) {
        return super.findById(id);
    }
}