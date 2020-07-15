package com.example.library.bookApi.v1.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class BookListDTO {

    List<BookDTO>books;
}
