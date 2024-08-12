package com.springframework.springapp.controller;

import com.springframework.springapp.services.BookService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BookController {
    private BookService bookService;
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }
    @RequestMapping("/books")
    public String getBooks(Model model){
        model.addAttribute("books",bookService.findAll());
        return "books";
    }
}
