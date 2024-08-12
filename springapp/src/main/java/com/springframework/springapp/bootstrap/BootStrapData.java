package com.springframework.springapp.bootstrap;

import com.springframework.springapp.domain.Author;
import com.springframework.springapp.domain.Book;
import com.springframework.springapp.domain.Publisher;
import com.springframework.springapp.domain.repositories.AuthorRepository;
import com.springframework.springapp.domain.repositories.BookRepository;
import com.springframework.springapp.domain.repositories.PublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;

    public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Author ranga = new Author();
        ranga.setFirstName("Ranga");
        ranga.setLastName("Kovela");

        Book ddd = new Book();
        ddd.setIsbn("1234");
        ddd.setTitle("DDD");




        Author rangaSaved = authorRepository.save(ranga);
        Book dddSaved = bookRepository.save(ddd);

        Publisher apache = new Publisher();
        apache.setAddress("123");
        apache.setEmail("apache@gmail.com");
        apache.setName("Apache Software");
        apache.setPhone("121231231");
        Publisher apacheSaved = publisherRepository.save(apache);

        rangaSaved.getBooks().add(dddSaved);
        dddSaved.getAuthors().add(rangaSaved);


        dddSaved.setPublishers(apacheSaved);

        bookRepository.save(dddSaved);
        authorRepository.save(rangaSaved);


        System.out.println(bookRepository.count());
        System.out.println(authorRepository.count());
        System.out.println(publisherRepository.count());

    }
}
