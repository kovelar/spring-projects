package com.springframework.springapp.domain;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Objects;
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
    private Set<Author> authors = new HashSet<>();

    @ManyToOne
    private Publisher publishers ;


    public Publisher getPublishers() {
        return publishers;
    }

    public void setPublishers(Publisher publishers) {
        this.publishers = publishers;
    }





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

    @Override
    public String toString() {
        return "Book{" +
                "Id=" + Id +
                ", isbn='" + isbn + '\'' +
                ", title='" + title + '\'' +
                ", authors=" + authors +
                '}';
    }

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book book)) return false;

        return Objects.equals(Id, book.Id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(Id);
    }
}


