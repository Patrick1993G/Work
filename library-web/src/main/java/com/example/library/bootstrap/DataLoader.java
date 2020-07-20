package com.example.library.bootstrap;

import com.example.library.model.*;
import com.example.library.repositories.*;
import com.example.library.services.*;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Component
public class DataLoader implements CommandLineRunner {


    @Autowired private AuthorRepo authorRepo;
    @Autowired private BookRepo bookRepo;
    @Autowired private CustomerRepo customerRepo;
    @Autowired private CheckoutRepo checkoutRepo;
    @Autowired private CategoryRepo categoryRepo;

    @Override
    public void run(String... args) throws Exception {
//        Author author = new Author();
//        author.setName("Jk");
//        author.setSurname("Rowling");
//        author.setAge((byte) 30);
//        author.setId_card("342589M");
//        author.setNumOfBooks((byte) 2);
//        authorRepo.save(author);
//
//        Author author2 = new Author();
//        author2.setName("Martina");
//        author2.setSurname("Cole");
//        author2.setAge((byte) 40);
//        author.setId_card("345570M");
//        author2.setNumOfBooks((byte) 6);
//        authorRepo.save(author2);
//
//        Author author3 = new Author();
//        author3.setName("Agatha");
//        author3.setSurname("Christie");
//        author3.setAge((byte) 0);
//        author.setId_card("323510M");
//        author3.setNumOfBooks((byte) 80);
//        authorRepo.save(author3);
//
//        System.out.println("Authors Loaded");
//
//
//        //sample categories
//        Category category = new Category();
//        category.setName("Fiction");
//        categoryRepo.save(category);
//        Category category2 = new Category();
//        category.setName("Sci-Fi");
//        categoryRepo.save(category2);
//        Category category3 = new Category();
//        category.setName("Documentary");
//        categoryRepo.save(category3);
//        Category category4 = new Category();
//        category.setName("Horror");
//        categoryRepo.save(category4);
//        //sample books
//        Book book1 = new Book();
//        Book book2 = new Book();
//        book1.setTitle("Harry Potter 1");
//        book1.setCategory(category);
//        book1.setAuthor(author);
//        book1.setIsbn(123232L);
//        book1.setNumOfPages((short)200);
//        book1.setPrice((short) 13);
//        bookRepo.save(book1);
//
//        book2.setTitle("Harry Potter 2");
//        book2.setCategory(category);
//        book2.setAuthor(author);
//        book2.setIsbn(123233L);
//        book2.setNumOfPages((short)250);
//        book2.setPrice((short) 16);
//        bookRepo.save(book2);
//        System.out.println("Books Loaded");
//
//        Customer customer = new Customer();
//        customer.setName("Philip");
//        customer.setSurname("Gatt");
//        customer.setAge((byte) 32);
//        customer.setId_card("403990M");
//        customerRepo.save(customer);
//        System.out.println("customers Loaded ");
//
//        Checkout checkout = new Checkout();
//        Set<Book> books = new HashSet<>();
//        LocalDate fromDate,toDate;
//        fromDate = LocalDate.now();
//        toDate=fromDate.plusDays(3);
//        books.add(book1);
//        checkout.setBooks(books);
//        checkout.setFromDate(fromDate);
//        checkout.setToDate(toDate);
//        checkout.setCustomer(customer);
//        checkoutRepo.save(checkout);
//        System.out.println(fromDate);
//        System.out.println(toDate);
//        System.out.println("checkouts Loaded");
    }
}
