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
import java.util.HashSet;
import java.util.Set;

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
        Category category = new Category();
        category.setName("Fiction");
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
        customerService.save(customer);
        System.out.println("customers Loaded ");

        Checkout checkout = new Checkout();
        Set<Book> books = new HashSet<>();
        LocalDate fromDate,toDate;
        fromDate = LocalDate.now();
        toDate=fromDate.plusDays(3);
        books.add(book);
        checkout.setBooks(books);
        checkout.setFromDate(fromDate);
        checkout.setToDate(toDate);
        checkout.setCustomer(customer);
        checkoutService.save(checkout);
        System.out.println("checkouts Loaded");
    }
}
