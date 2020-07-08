package com.example.library.model;

import lombok.Getter;
import lombok.Setter;

public class Book {
    @Getter
    @Setter
    private String Title;
    private Category category;
    private Long isbn;
    private Short numOfPages;
    private Author author;

    public Book(String Title, Category category, Long isbn, Short numOfPages, Author author) {
        this.Title = Title;
        this.category = category;
        this.isbn = isbn;
        this.numOfPages = numOfPages;
        this.author = author;
    }
}
