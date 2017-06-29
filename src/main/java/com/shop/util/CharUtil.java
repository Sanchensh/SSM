package com.shop.util;

/**
 * Created by Mr Xu on 2017/6/22.
 */
public class CharUtil {
    private final static String check(String message,String target){
        if(target==null||target.trim().length()==0)
            throw new ShopException(message);
        return target;
    }
    public static String $(String message,String target){
        return check(message,target);
    }
}
