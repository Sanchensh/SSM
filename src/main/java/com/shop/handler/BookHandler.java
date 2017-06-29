package com.shop.handler;

import com.shop.entity.Book;
import com.shop.service.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Mr Xu on 2017/6/22.
 */
@Controller
public class BookHandler {
    @Autowired
    BookDao bookDao;

    @RequestMapping("/getAll")
    public void getAll(){
        List<Book> list = bookDao.findBook(null);
        System.out.println(list);
        Map<String ,List> map = new HashMap<String, List>();
        map.put("list",list);
    }
}
