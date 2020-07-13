package com.example.library.bootstrap;

import com.example.library.model.*;
import com.example.library.services.AuthorService;
import com.example.library.services.BookService;
import com.example.library.services.CheckoutService;
import com.example.library.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component

public class DataLoader implements CommandLineRunner {


    @Autowired @Qualifier("authorServiceMap") private AuthorService authorService;
    @Autowired @Qualifier("bookServiceMap")private BookService bookService;
    @Autowired @Qualifier("customerServiceMap")private CustomerService customerService;
    @Autowired @Qualifier("checkoutServiceMap")private CheckoutService checkoutService;


    @Override
    public void run(String... args) throws Exception {
        Author author = new Author();
        author.setName("Jk");
        author.setSurname("Rowling");
        author.setAge((byte) 30);
        author.setNumOfBooks((byte) 1);
        authorService.save(author);
        System.out.println("Authors Loaded");

        Book book = new Book();
        Category category = new Category("Fiction");
        book.setTitle("Harry Potter 1");
        book.setCategory(category);
        book.setAuthor(author);
        book.setIsbn(123232L);
        book.setNumOfPages((short)200);
        book.setPrice((short) 13);
        bookService.save(book);
        System.out.println("Books Loaded");

        Customer customer = new Customer();
        customer.setName("Philip");
        customer.setSurname("Gatt");
        customer.setAge((byte) 32);
        System.out.println("customers Loaded ");

        Checkout checkout = new Checkout();
        LocalDate fromDate,toDate;
        fromDate = LocalDate.now();
        toDate=fromDate.plusDays(3);
        checkout.setBook(book);
        checkout.setFromDate(fromDate);
        checkout.setToDate(toDate);
        checkout.setCustomer(customer);
        System.out.println("checkouts Loaded");
    }
}
