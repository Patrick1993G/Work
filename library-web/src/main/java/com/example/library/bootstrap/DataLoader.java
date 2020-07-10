package com.example.library.bootstrap;

import com.example.library.model.Author;
import com.example.library.model.Book;
import com.example.library.model.Category;
import com.example.library.services.AuthorService;
import com.example.library.services.BookService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {


    private final AuthorService authorService;
    private final BookService bookService;

    public DataLoader(AuthorService authorService, BookService bookService) {
        this.authorService = authorService;
        this.bookService = bookService;
    }

    @Override
    public void run(String... args) throws Exception {
        Author author = new Author();
        Book book = new Book();

        author.setId(1L);
        author.setName("Jk");
        author.setSurname("Rowling");
        author.setAge((byte) 30);
        author.setNumOfBooks((byte) 1);
        authorService.save(author);
        System.out.println("Authors Loaded");

        Category category = new Category("Fiction");
        book.setId(1L);
        book.setTitle("Harry Potter 1");
        book.setCategory(category);
        book.setAuthor(author);
        book.setIsbn(123232L);
        book.setNumOfPages((short)200);
        book.setPrice((short) 13);
        bookService.save(book);
        System.out.println("Books Loaded");
    }
}
