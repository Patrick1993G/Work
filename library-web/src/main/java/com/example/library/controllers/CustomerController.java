package com.example.library.controllers;

import com.example.library.services.CustomerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
@RequestMapping("/customers")
@Controller
public class CustomerController {
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
