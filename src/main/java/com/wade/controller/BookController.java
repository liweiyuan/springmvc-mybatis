package com.wade.controller;

import com.wade.entity.Book;
import com.wade.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by tingyun on 2018/3/13.
 */
@RestController
public class BookController {

    @Autowired
    private BookService bookService;

    @RequestMapping("/all")
    @ResponseBody
    public List<Book> getAllbooks(){
        return bookService.getAllBooks();
    }

    @RequestMapping("/select")
    @ResponseBody
    public Book getBookById(){
        return bookService.getBookById(3);
    }
}
