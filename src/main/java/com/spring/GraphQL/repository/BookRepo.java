package com.spring.GraphQL.repository;

import com.spring.GraphQL.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepo extends JpaRepository<Book,Integer> {

}
