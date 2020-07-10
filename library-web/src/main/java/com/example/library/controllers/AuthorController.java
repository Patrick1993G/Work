package com.example.library.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AuthorController {

    @RequestMapping({"/authors","/authors/index","/authors/index.html"})
    public String listAuthors(){
        return "authors/index";
    }
}
