package com.shop.service;

import com.shop.entity.Buyer;
import com.shop.entity.Shopkeeper;

/**
 * Created by Mr Xu on 2017/6/22.
 */
public interface LoginDao {
    Buyer BLogin(String buyerName,String password);
    Shopkeeper SLogin(String shopkeeperName,String password);
}
