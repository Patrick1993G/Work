package com.example.library.repositories;

import com.example.library.model.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepo extends CrudRepository<Category,Long> {
}
