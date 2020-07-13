package com.example.library.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.HashSet;
import java.util.Set;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Customer extends Person {


    @Builder
    public Customer(Long id, String name, String surname, Byte age, Set<Book> books) {
        super(id, name, surname, age);
        this.books = books;
    }

    @OneToMany(mappedBy = "customer")
    private Set<Book> books = new HashSet<>();
}
