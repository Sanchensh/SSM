package com.shop.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.shop.entity.Book;

public interface BookMapper {
	List<Book> getBooks();
	public List<Book> findBook(@Param("bookName") String bookName);
	public void insertBook(@Param("book") Book book);
	public void deleteBook(@Param("bookID") String id);
	public void updateBook(@Param("book") Book book);
}
