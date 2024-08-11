package com.springframework.springapp.domain;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class Book {
    @Id
    @GeneratedValue(strategy =  GenerationType.AUTO)
    private Long Id;
    private String isbn;
    private String title;
    @ManyToMany
    @JoinTable(name = "author_book",joinColumns = @JoinColumn(name = "book_id"), inverseJoinColumns = @JoinColumn(name = "author_id"))
    private Set<Author> authors;


    public Set<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(Set<Author> authors) {
        this.authors = authors;
    }


    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
