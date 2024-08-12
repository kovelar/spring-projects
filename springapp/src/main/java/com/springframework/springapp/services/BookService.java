package com.springframework.springapp.services;

import com.springframework.springapp.domain.Book;

public interface BookService {
    Iterable<Book> findAll();
}
