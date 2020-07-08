package com.example.library.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

public class Author {
    @Getter
    @Setter
    private String name,surname,age;
    private Byte numOfBooks;
    private List<Book> books;


    public Author(String name, String surname, String age, Byte numOfBooks, List<Book> books) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.numOfBooks = numOfBooks;
        this.books = books;
    }
}
