package com.library.rent.web.book.service;

import com.library.rent.web.book.repository.BookFeignClient;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Log4j2
public class BookFeignService {

    private final BookFeignClient feignClient;

    @Autowired
    public BookFeignService(BookFeignClient feignClient) {
        this.feignClient = feignClient;
    }

    public String getBookFromKakaoOpenApi(int size, int page, String sort, String query, String target) {
        return feignClient.getBookFromKakaoOpenApi(size, page, sort, query, target);
    }
}
