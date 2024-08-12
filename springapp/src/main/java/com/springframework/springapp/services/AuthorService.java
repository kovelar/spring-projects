package com.springframework.springapp.services;

import com.springframework.springapp.domain.Author;


public interface AuthorService {
    Iterable<Author> findAll();
}
