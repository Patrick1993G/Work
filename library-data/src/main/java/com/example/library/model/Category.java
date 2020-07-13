package com.example.library.model;

import lombok.*;
import org.hibernate.annotations.ManyToAny;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="categories")
public class Category extends BaseEntity{
    @Getter
    @Setter
    @Column(name="categoryName")
    private String name;

    @OneToMany (mappedBy = "category")
    private Set<Book> books = new HashSet<>();

    @Builder
    public Category(Long id, String name) {
        super(id);
        this.name = name;
    }

}
