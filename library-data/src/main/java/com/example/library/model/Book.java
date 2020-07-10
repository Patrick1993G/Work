package com.example.library.model;

import lombok.Getter;
import lombok.Setter;

public class Book extends BaseEntity{
    @Getter
    @Setter
    private String title;
    @Getter
    @Setter
    private Category category;
    @Getter
    @Setter
    private Long isbn;
    @Getter
    @Setter
    private Short numOfPages,price;
    @Getter
    @Setter
    private Author author;
    public Book(){

    }
    public Book(String Title, Category category, Long isbn, Short numOfPages, Short price, Author author) {
        this.title = Title;
        this.category = category;
        this.isbn = isbn;
        this.numOfPages = numOfPages;
        this.price = price;
        this.author = author;
    }
}
