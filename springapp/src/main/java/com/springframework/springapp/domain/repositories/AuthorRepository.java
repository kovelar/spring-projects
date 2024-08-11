package com.springframework.springapp.domain.repositories;

import com.springframework.springapp.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
