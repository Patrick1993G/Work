package com.example.library.services.map;

import com.example.library.model.Author;
import com.example.library.services.AuthorService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Set;
@Service
@Profile({"default","map"})
public class AuthorServiceMap extends AbstractServiceMap<Author,Long> implements AuthorService {
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
        return super.save(obj);
    }

    @Override
    public void delete(Author obj) {
        super.delete(obj);
    }

    @Override
    public Author findById(Long id) {
        return this.findById(id);
    }

    @Override
    public Author findByLastName(String lastName) {
        return null;
    }
}
