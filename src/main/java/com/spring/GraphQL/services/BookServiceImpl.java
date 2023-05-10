package com.spring.GraphQL.services;

import com.spring.GraphQL.entity.Book;
import com.spring.GraphQL.repository.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService{

    private BookRepo bookRepo;

    @Autowired
    public BookServiceImpl(BookRepo bookRepo) {
        this.bookRepo = bookRepo;
    }

    @Override
    public Book create(Book book) {
        return this.bookRepo.save(book);
    }

    @Override
    public List<Book> getAll() {
        return this.bookRepo.findAll();
    }

    @Override
    public Book get(int BookId) {
        return this.bookRepo.findById(BookId).orElseThrow( () -> new RuntimeException("The book you are looking for is not available !!"));
    }
}
