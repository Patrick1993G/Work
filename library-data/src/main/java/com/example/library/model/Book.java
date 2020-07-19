package com.example.library.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name="books")
public class Book extends BaseEntity{
    @Column(name="title")
    private String title;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    @Column(name="isbn")
    private Long isbn;
    @Column(name="noOfPages")
    private Short numOfPages;
    @Column(name="price")
    private Short price;

    @ManyToOne
    @JoinColumn(name="author_id")
    private Author author;

    @ManyToOne
    @JoinColumn(name="checkout_id")
    private Checkout checkout;



    @Builder
    public Book(Long id, String title, Category name, Long isbn, Short numOfPages, Short price, Author author) {
        super(id);
        this.title = title;
        this.category = name;
        this.isbn = isbn;
        this.numOfPages = numOfPages;
        this.price = price;
        this.author = author;
    }

}
