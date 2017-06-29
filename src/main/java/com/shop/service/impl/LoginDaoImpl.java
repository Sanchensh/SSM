package com.shop.service.impl;

import com.shop.dao.BuyerMapper;
import com.shop.dao.ShopkeeperMapper;
import com.shop.entity.Buyer;
import com.shop.entity.Shopkeeper;
import com.shop.service.LoginDao;

import static com.shop.util.CharUtil.$;

import com.shop.util.ShopException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Mr Xu on 2017/6/22.
 */
@Service
public class LoginDaoImpl implements LoginDao {

    @Autowired
    BuyerMapper buyerMapper;

    @Autowired
    ShopkeeperMapper shopkeeperMapper;

    public Buyer BLogin(String buyerName, String password) {
        buyerName = $("账号不能为空！", buyerName);
        password = $("密码不能为空！", password);
        Buyer buyer = buyerMapper.findBuyer(buyerName);
        if (buyer == null)
            throw new ShopException("该用户不存在！");
        if (!buyer.getPassword().equals(password))
            throw new ShopException("密码输入错误！");
        return buyer;
    }

    public Shopkeeper SLogin(String shopkeeperName, String password) {
        shopkeeperName = $("账号不能为空！", shopkeeperName);
        password = $("密码不能为空！", password);
        Shopkeeper shopkeeper = shopkeeperMapper.findShopkeeper(shopkeeperName);
        if (shopkeeper == null)
            throw new ShopException("该用户不存在！");
        if (!shopkeeper.getPassword().equals(password))
            throw new ShopException("密码输入错误！");
        return shopkeeper;
    }
}
