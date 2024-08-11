package com.springframework.springapp.bootstrap;

import com.springframework.springapp.domain.Author;
import com.springframework.springapp.domain.Book;
import com.springframework.springapp.domain.repositories.AuthorRepository;
import com.springframework.springapp.domain.repositories.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;

    public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
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

        rangaSaved.getBooks().add(dddSaved);
        dddSaved.getAuthors().add(rangaSaved);
        bookRepository.save(dddSaved);
        authorRepository.save(rangaSaved);

        System.out.println(bookRepository.count());
        System.out.println(authorRepository.count());

    }
}
