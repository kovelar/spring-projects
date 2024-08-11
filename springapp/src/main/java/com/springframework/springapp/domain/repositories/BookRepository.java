package com.springframework.springapp.domain.repositories;

import com.springframework.springapp.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
