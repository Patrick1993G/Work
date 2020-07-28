package com.example.library.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class IndexController {
    @Autowired
    @RequestMapping({"","/","index.html"})
    public String index(){
        return "index";
    }

}
