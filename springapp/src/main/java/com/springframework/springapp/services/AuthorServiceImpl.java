package com.springframework.springapp.services;

import com.springframework.springapp.domain.Author;
import com.springframework.springapp.domain.repositories.AuthorRepository;
import org.springframework.stereotype.Service;

@Service
public class AuthorServiceImpl implements AuthorService {
    private final AuthorRepository authorRepository   ;

    public AuthorServiceImpl(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }


    @Override
    public Iterable<Author> findAll() {
        return authorRepository.findAll();
    }
}
