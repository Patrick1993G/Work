package com.example.library.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

public class Author extends BaseEntity{
    @Getter
    @Setter
    private String name,surname;
    @Getter
    @Setter
    private Byte numOfBooks,age;

    public Author(){

    }
    public Author(String name, String surname, Byte age, Byte numOfBooks) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.numOfBooks = numOfBooks;
    }
}
