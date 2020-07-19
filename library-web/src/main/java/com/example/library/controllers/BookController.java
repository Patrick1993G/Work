package com.example.library.controllers;

import com.example.library.bookApi.v1.model.BookDTO;
import com.example.library.bookApi.v1.model.BookListDTO;
import com.example.library.services.BookService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/api/v1/bookApi")
public class BookController {
    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping
    public ResponseEntity<BookListDTO> getAllBooks(){
        return new ResponseEntity<BookListDTO>(
            new BookListDTO((List<BookDTO>) bookService.getAllBooks()), HttpStatus.OK);

    }

    @GetMapping("{title}")
    public ResponseEntity<BookDTO> getBookByTitle(@PathVariable String title){
        return new ResponseEntity<BookDTO>(
                (MultiValueMap<String, String>) bookService.findByTitle(title),HttpStatus.OK
        );
    }
//    @RequestMapping({"/books","/books/index","/books/index.html"})
//    public String listBooks(Model model)
//    {
//        model.addAttribute("books",bookService.getAllBooks());
//        return "books/index";
//    }
}
