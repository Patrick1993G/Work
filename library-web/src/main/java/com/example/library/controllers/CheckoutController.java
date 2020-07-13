package com.example.library.controllers;

import com.example.library.services.CheckoutService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CheckoutController {
    private final CheckoutService checkoutService;
    public CheckoutController(CheckoutService checkoutService){
        this.checkoutService = checkoutService;
    }
    @RequestMapping({"/checkouts","/checkouts/index","/checkouts/index.html"})
    public String ListCheckouts(Model model){
        model.addAttribute("checkouts", checkoutService.findAll());
        return "checkouts/index";
    }
}
