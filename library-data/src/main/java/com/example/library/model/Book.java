package com.example.library.model;

import lombok.Getter;
import lombok.Setter;

public class Book {
    @Getter
    @Setter
    private String title;
    private Category category;
    private Long isbn;
    private Short numOfPages,price;
    private Author author;

    public Book(String Title, Category category, Long isbn, Short numOfPages, Short price, Author author) {
        this.title = Title;
        this.category = category;
        this.isbn = isbn;
        this.numOfPages = numOfPages;
        this.price = price;
        this.author = author;
    }
}
