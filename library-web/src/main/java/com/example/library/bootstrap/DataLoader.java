package com.example.library.bootstrap;

import com.example.library.model.*;
import com.example.library.services.AuthorService;
import com.example.library.services.BookService;
import com.example.library.services.CheckoutService;
import com.example.library.services.CustomerService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DataLoader implements CommandLineRunner {


    private final AuthorService authorService;
    private final BookService bookService;
    private final CustomerService customerService;
    private final CheckoutService checkoutService;
    public DataLoader(AuthorService authorService, BookService bookService, CustomerService customerService, CheckoutService checkoutService) {
        this.authorService = authorService;
        this.bookService = bookService;
        this.customerService = customerService;
        this.checkoutService = checkoutService;
    }

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
