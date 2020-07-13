package com.example.library.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name="books")
public class Book extends BaseEntity{
    @Column(name="title")
    private String title;
    @Column(name="category")
    private Category category;
    @Column(name="isbn")
    private Long isbn;
    @Column(name="nofPages")
    private Short numOfPages;
    @Column(name="price")
    private Short price;

    @Column(name="author")
    private Author author;

    @Builder
    public Book(Long id, String title, Category category, Long isbn, Short numOfPages, Short price, Author author) {
        super(id);
        this.title = title;
        this.category = category;
        this.isbn = isbn;
        this.numOfPages = numOfPages;
        this.price = price;
        this.author = author;
    }

}
