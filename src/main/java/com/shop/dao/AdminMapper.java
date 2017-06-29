package com.shop.dao;

import org.apache.ibatis.annotations.Param;

import com.shop.entity.Admin;
/*
 * 管理员
 */
public interface AdminMapper {
	public Admin findAdmin(@Param("adminID") String id);
	public void updateAdmin(@Param("admin") Admin admin);
}
