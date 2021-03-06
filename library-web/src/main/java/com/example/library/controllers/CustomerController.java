package com.example.library.controllers;

import com.example.library.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class CustomerController {
    @Autowired
    private final CustomerService customerService;
    public CustomerController(CustomerService customerService){
        this.customerService = customerService;
    }
    @RequestMapping({"/customers","/customers/index","/customers/index.html"})
    public String ListCustomers(Model model){
        model.addAttribute("customers", customerService.findAll());
        return "customers/index";
    }
}
