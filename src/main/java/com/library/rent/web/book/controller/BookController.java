package com.library.rent.web.book.controller;

import com.library.rent.util.page.PageRequest;
import com.library.rent.web.book.dto.BookDto;
import com.library.rent.web.book.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookController {


    private final BookService bookService;

    @Autowired
    public BookController(BookService bookService)
    {
        this.bookService = bookService;
    }

    @PostMapping("/xlsx/books")
    public void setBooksXlsx(@RequestBody BookDto.SetBooksXlsxParam param)
    {
        bookService.setBooksXlsx(param);
    }

    @GetMapping("/admin/book")
    public List<BookDto.BookInfo> getBooksAdmin(BookDto.SearchBooksParam param)
    {
        return bookService.getBooksAdmin(param);
    }

    @GetMapping("/books")
    public List<BookDto.BookInfo> getBooks(PageRequest pageRequest, BookDto.SearchBooksParam param)
    {
        return bookService.getBooks(pageRequest, param);
    }

}
