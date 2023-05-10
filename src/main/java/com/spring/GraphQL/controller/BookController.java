package com.spring.GraphQL.controller;

import com.spring.GraphQL.entity.Book;
import com.spring.GraphQL.services.BookService;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@RestController
//@RequestMapping("/api/v1")
@Controller
public class BookController {

    @Autowired
    private BookService bookService;

    //create
    @MutationMapping("createBook")
    public Book create(@Argument BookInput book){
        Book b = new Book();
        b.setTitle(book.getTitle());
        b.setPrice(book.getPrice());
        b.setAuthor(book.getAuthor());
        b.setPages(book.getPages());
        b.setPrice(book.getPrice());
        b.setDescription(book.getDescription());
        return this.bookService.create(b);
    }

    //get all
    @QueryMapping("allBooks")
    public List<Book> getAllBooks(){
        return this.bookService.getAll();
    }

    //get single
    @QueryMapping("getBook")
    public Book getSingleBook(@Argument int bookId){
        return this.bookService.get(bookId);
    }
}
@Getter
@Setter
class BookInput{
    private String title;
    private String description;
    private String  author;
    private double price;
    private int pages;
}