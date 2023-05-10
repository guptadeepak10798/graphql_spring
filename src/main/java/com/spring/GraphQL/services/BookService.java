package com.spring.GraphQL.services;

import com.spring.GraphQL.entity.Book;

import java.util.List;

public interface BookService {

    //create
    Book create(Book book);

    //get All
    List<Book> getAll();

    //get single book
    Book get(int BookId);

}
