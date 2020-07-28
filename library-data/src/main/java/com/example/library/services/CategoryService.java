package com.example.library.services;

import com.example.library.bookApi.v1.model.CategoryDTO;
import com.example.library.model.Category;

import java.util.List;

public interface CategoryService {
    List<CategoryDTO> getAllCategories();
    CategoryDTO getCategoryByName(String title);
    CategoryDTO addCategory(CategoryDTO categoryDTO);
    CategoryDTO saveCategoryByTitle (String title ,CategoryDTO categoryDTO);
    void deleteCategoryById(Long id);
}
