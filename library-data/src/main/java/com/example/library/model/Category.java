package com.example.library.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="categories")
public class Category extends BaseEntity{
    @Getter
    @Setter
    @Column(name="type")
    private String type;

    @Builder
    public Category(Long id, String type) {
        super(id);
        this.type = type;
    }

}
