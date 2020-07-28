package com.example.library.model;

import lombok.*;
import org.hibernate.annotations.ManyToAny;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
public class Category extends BaseEntity{

    private Set<Book> books = new HashSet<>();
    private String title;

}
