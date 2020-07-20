package com.example.library.model;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.HashSet;
import java.util.Set;
@Getter
@Setter
@Entity
@NoArgsConstructor
@Table(name = "authors")

public class Author extends Person{
    @Column(name="numOfBooks")
    private Byte numOfBooks;
    @OneToMany(mappedBy = "author")
    private Set<Book> books = new HashSet<>();
    @Builder
    public Author(String name, String surname, Byte age,String id_card, Byte numOfBooks, Set<Book> books) {
        super(name, surname, age,id_card);
        this.numOfBooks = numOfBooks;
        this.books = books;
    }

}
