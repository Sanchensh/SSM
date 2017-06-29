package com.shop.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.shop.entity.Shopkeeper;

/*
 * 店主
 */
public interface ShopkeeperMapper {
	public Shopkeeper findShopkeeper(@Param("shopkeeperName") String shopkeeperName);
	public void insertShopkeeper(@Param("shopkeeper") Shopkeeper shopkeeper);
	public void deleteShopkeeper(@Param("shopkeeperID") String id);
	public void updateShopkeeper(@Param("shopkeeper") Shopkeeper shopkeeper);

}
