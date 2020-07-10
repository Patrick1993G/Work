package com.example.library.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BookController {
    @RequestMapping({"/Books","/books/index","/books/index.html"})
    public String listBooks(){
        return "books/index";
    }
}
