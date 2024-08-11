package com.springframework.springapp.domain.repositories;

import com.springframework.springapp.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
