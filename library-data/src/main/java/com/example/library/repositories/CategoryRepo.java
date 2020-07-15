package com.example.library.repositories;

import com.example.library.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepo extends JpaRepository<Category,Long> {
    Category findByName(String name);
}
