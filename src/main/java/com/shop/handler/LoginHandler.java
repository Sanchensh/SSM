package com.shop.handler;

import com.shop.entity.Book;
import com.shop.entity.Buyer;
import com.shop.service.BookDao;
import com.shop.service.LoginDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Mr Xu on 2017/6/22.
 */
@Controller
public class LoginHandler {

    @Autowired
    LoginDao loginDao;

    @Autowired
    BookDao bookDao;

    @RequestMapping("/login")
    public ModelAndView login(@RequestParam("buyerName") String buyerName, @RequestParam("password") String password,HttpServletRequest request){
        try {
            Buyer buyer = loginDao.BLogin(buyerName,password);
            ModelAndView modelAndView = new ModelAndView("index");
            Map<String,Object> map = new HashMap<String,Object>();
            List<Book> list = bookDao.getBooks();//登陆后显示所有书本信息
            map.put("buyer",buyer);
            map.put("list",list);
            modelAndView.addAllObjects(map);
            return modelAndView;
        }catch (Exception e){
            return new ModelAndView("login");
        }
    }
    @RequestMapping("/")
    public String home(){
        return "login";
    }
}
