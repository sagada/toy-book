package com.library.rent.web.book.repository;

import com.library.rent.web.book.dto.BookDto;

import java.util.List;

public interface BookRepositoryCustom {
     List<BookDto.BookInfo> getBooks(BookDto.SearchBooksParam param);
}
