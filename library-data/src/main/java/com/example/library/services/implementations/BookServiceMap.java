package com.example.library.services.implementations;

import com.example.library.bookApi.v1.mapper.BookMapper;
import com.example.library.bookApi.v1.model.BookDTO;
import com.example.library.model.Book;
import com.example.library.repositories.BookRepo;
import com.example.library.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
//@Profile({"default","map"})
public class BookServiceMap extends AbstractServiceMap<Book,Long> implements BookService {
    @Autowired  private BookMapper bookMapper;
    @Autowired  private BookRepo bookRepo;


    @Override
    public BookDTO findByIsbn(Long isbn) {
        return bookMapper.bookToBookDTO(bookRepo.findByIsbn(isbn));
    }

    @Override
    public BookDTO findByTitle(String title) {
        return bookMapper.bookToBookDTO(bookRepo.findByTitle(title));
    }

    @Override
    public List<BookDTO> getAllBooks() {
        return super.findAll().stream().map(bookMapper::bookToBookDTO).collect(Collectors.toList());
    }

//    @Override
//    public Set<Book> findAll() {
//        return super.findAll();
//    }
//
//    @Override
//    public void deleteById(Long id) {
//        super.deleteById(id);
//    }
//
//    @Override
//    public Book save(Book obj) {
//        return super.save(obj);
//    }
//
//    @Override
//    public void delete(Book obj) {
//        super.delete(obj);
//    }
//
//    @Override
//    public Book findById(Long id) {
//        return super.findById(id);
//    }
//
//    @Override
//    public Book findByIsbn(Long isbn) {
//        return null;
//    }
//
//    @Override
//    public Book findByTitle(String Title) {
//        return null;
//    }
}
