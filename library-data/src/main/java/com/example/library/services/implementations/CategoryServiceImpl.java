package com.example.library.services.implementations;

import com.example.library.bookApi.v1.mapper.CategoryMapper;
import com.example.library.bookApi.v1.model.CategoryDTO;
import com.example.library.model.Category;
import com.example.library.repositories.CategoryRepo;
import com.example.library.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired private CategoryMapper categoryMapper;
    @Autowired private CategoryRepo categoryRepo;
    @Override
    public List<CategoryDTO> getAllCategories() {
        return categoryRepo.findAll()
                .stream()
                .map(categoryMapper::categoryToCategoryDTO)
                .collect(Collectors.toList());
    }

    @Override
    public CategoryDTO getCategoryByName(String title) {

        return categoryMapper.categoryToCategoryDTO(categoryRepo.findByTitle(title));
    }
    @Override
    public CategoryDTO addCategory(CategoryDTO categoryDTO) {
        return saveAndReturnDTO(categoryMapper.categoryDtoToCategory(categoryDTO));
    }

    private CategoryDTO saveAndReturnDTO(Category category) {

        Category savedCustomer = categoryRepo.save(category);
        CategoryDTO returnDto = categoryMapper.categoryToCategoryDTO(savedCustomer);

        return returnDto;
    }
    @Override
    public CategoryDTO saveCategoryByTitle(String title, CategoryDTO categoryDTO) {
        Category category = categoryMapper.categoryDtoToCategory(categoryDTO);
        category.setTitle(title);

        return saveAndReturnDTO(category);
    }

    @Override
    public void deleteCategoryById(Long id) {
        categoryRepo.deleteById(id);
    }


}
