package com.springframework.springapp.domain;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
public class Publisher {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;
    private String name;
    private String address;
    private String phone;
    private String email;
    @OneToMany(mappedBy = "publishers")
    private Set<Book> books = new HashSet<>();

    public Set<Book> getBooks() {
        return books;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }



    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Publisher{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", books=" + books +
                '}';
    }

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Publisher publisher)) return false;

        return Objects.equals(Id, publisher.Id) && Objects.equals(name, publisher.name) && Objects.equals(address, publisher.address) && Objects.equals(phone, publisher.phone) && Objects.equals(email, publisher.email) && Objects.equals(books, publisher.books);
    }

    @Override
    public int hashCode() {
        int result = Objects.hashCode(Id);
        result = 31 * result + Objects.hashCode(name);
        result = 31 * result + Objects.hashCode(address);
        result = 31 * result + Objects.hashCode(phone);
        result = 31 * result + Objects.hashCode(email);
        result = 31 * result + Objects.hashCode(books);
        return result;
    }
}


