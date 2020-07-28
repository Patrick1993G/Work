package com.example.library.controllers;

import com.example.library.bookApi.v1.model.CategoryDTO;
import com.example.library.bookApi.v1.model.CategoryListDTO;
import com.example.library.repositories.CategoryRepo;
import com.example.library.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping("/api/v1/categories/")
public class CategoryController {
    @Autowired private CategoryService categoryService;
    @Autowired private CategoryRepo categoryRepo;
    @GetMapping
    public @ResponseBody ResponseEntity<CategoryListDTO> getAllCategories(){

        return new ResponseEntity<CategoryListDTO>(
                new CategoryListDTO(categoryService.getAllCategories()), HttpStatus.OK);
    }

    @GetMapping("{title}")
    public @ResponseBody ResponseEntity<CategoryDTO> getCategoryByName(@PathVariable String title){
        return new ResponseEntity<CategoryDTO>(
                categoryService.getCategoryByName(title), HttpStatus.OK
        );
    }
    @PostMapping(path="add")
    public ResponseEntity<CategoryDTO> addCategory(CategoryDTO categoryDTO) {
        return new ResponseEntity<CategoryDTO>(
                categoryService.addCategory(categoryDTO), HttpStatus.CREATED
        );
    }
    @PutMapping("{title}")
    public ResponseEntity<CategoryDTO> updateCategory(@PathVariable String title, @RequestBody CategoryDTO categoryDTO){
        return new ResponseEntity<CategoryDTO>(
                categoryService.saveCategoryByTitle(title,categoryDTO), HttpStatus.OK
        );
    }
    @DeleteMapping("{id}")
    public ResponseEntity<Void> deleteCategory(@PathVariable Long id){
        categoryService.deleteCategoryById(id);
        return new ResponseEntity<Void>(HttpStatus.OK
        );
    }
}

