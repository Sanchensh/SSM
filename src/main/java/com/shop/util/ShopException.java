package com.shop.util;

/**
 * Created by Mr Xu on 2017/6/22.
 */
public class ShopException extends RuntimeException{
    public ShopException(String message) {
        super(message);
    }

    public ShopException(String message, Throwable cause) {
        super(message, cause);
    }
}
