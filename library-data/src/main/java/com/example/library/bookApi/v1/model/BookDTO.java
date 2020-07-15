package com.example.library.bookApi.v1.model;


import com.example.library.model.Author;
import com.example.library.model.Category;
import lombok.Data;

@Data
public class BookDTO {
    private Long id;
    private String title;
    private Category category;
    private Long isbn;
    private Short noOfPAges;
    private Short price;
    private Author author;
}
