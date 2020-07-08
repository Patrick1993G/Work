package com.example.library.model;

import lombok.Getter;
import lombok.Setter;

public class Category {
    @Getter
    @Setter
    private String type;

    public Category(String type) {
        this.type = type;
    }
}
