package com.example.library.services.map;

import com.example.library.model.Author;
import com.example.library.services.CrudService;

import java.util.Set;

public class AuthorServiceMap extends AbstractMapService<Author,Long> implements CrudService<Author,Long> {
    @Override
    public Set<Author> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public Author save(Author obj) {
        return super.save(obj.getId(),obj);
    }

    @Override
    public void delete(Author obj) {
        super.delete(obj);
    }

    @Override
    public Author findById(Long id) {
        return this.findById(id);
    }
}