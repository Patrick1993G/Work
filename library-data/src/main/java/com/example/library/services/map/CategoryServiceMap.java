package com.example.library.services.map;

import com.example.library.model.Book;
import com.example.library.model.Category;
import com.example.library.services.BookService;
import com.example.library.services.CategoryService;

import java.util.Set;

public class CategoryServiceMap extends AbstractServiceMap<Category,Long> implements CategoryService {
    @Override
    public Set<Category> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Category obj) {
        super.delete(obj);
    }

    @Override
    public Category save(Category obj) {
        return super.save(obj);
    }

    @Override
    public Category findById(Long id) {
        return super.findById(id);
    }
}
