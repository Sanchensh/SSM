package com.shop.service;

import com.shop.entity.Book;

import java.util.List;

/**
 * Created by Mr Xu on 2017/6/22.
 */
public interface BookDao {
    List<Book> findBook(String bookName);
    List<Book> getBooks();
}
