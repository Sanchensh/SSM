package com.shop.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.shop.dao.BookMapper;
import com.shop.entity.Book;
import com.shop.service.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Mr Xu on 2017/6/22.
 */
@Service
public class BookDaoImpl implements BookDao {

    @Autowired
    BookMapper bookMapper;

    public List<Book> findBook(String bookName) {
        List<Book> list = bookMapper.findBook(bookName);
        System.out.println(list);
        return list;
    }

    public List<Book> getBooks() {
//        PageHelper.startPage(1,10);//显示第一页的十条数据
        List<Book> list = bookMapper.getBooks();
        return list;
    }
}
