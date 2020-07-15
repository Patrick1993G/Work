package com.example.library.bootstrap;

import com.example.library.model.*;
import com.example.library.services.*;
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
    @Autowired @Qualifier("categoryServiceMap") private CategoryService categoryService;

    @Override
    public void run(String... args) throws Exception {
        Author author = new Author();
        author.setName("Jk");
        author.setSurname("Rowling");
        author.setAge((byte) 30);
        author.setNumOfBooks((byte) 1);
        authorService.save(author);

        Author author2 = new Author();
        author2.setName("Martina");
        author2.setSurname("Cole");
        author2.setAge((byte) 40);
        author2.setNumOfBooks((byte) 6);
        authorService.save(author2);

        Author author3 = new Author();
        author3.setName("Agatha");
        author3.setSurname("Christie");
        author3.setAge((byte) 0);
        author3.setNumOfBooks((byte) 80);
        authorService.save(author3);

        System.out.println("Authors Loaded");

        Book book = new Book();
        //sample categories
        Category category = new Category();
        category.setName("Fiction");
        Category category2 = new Category();
        category.setName("Sci-Fi");
        Category category3 = new Category();
        category.setName("Documentary");
        Category category4 = new Category();
        category.setName("Horror");
        categoryService.save(category);
        categoryService.save(category2);
        categoryService.save(category3);
        categoryService.save(category4);
        //sample books
        book.setTitle("Harry Potter 1");
        book.setCategory(category);
        book.setAuthor(author);
        book.setIsbn(123232L);
        book.setNumOfPages((short)200);
        book.setPrice((short) 13);
        bookService.save(book);

        book.setTitle("Harry Potter 2");
        book.setCategory(category);
        book.setAuthor(author2);
        book.setIsbn(123233L);
        book.setNumOfPages((short)250);
        book.setPrice((short) 16);
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
