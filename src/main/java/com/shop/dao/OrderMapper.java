package com.shop.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.shop.entity.Order;

public interface OrderMapper {
	
	public List<Order> findOrder(@Param("orderID") String id);
	public void insertOrder(@Param("order") Order order);
	public void deleteOrder(@Param("orderID") String id);
	public void updateOrder(@Param("order") Order order);

}
