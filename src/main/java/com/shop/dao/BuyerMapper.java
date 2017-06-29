package com.shop.dao;

import org.apache.ibatis.annotations.Param;

import com.shop.entity.Buyer;
/*
 * 购书人
 */
public interface BuyerMapper {
	public Buyer findBuyer(@Param("buyerName") String buyerName);
	public void insertBuyer(@Param("buyer") Buyer buyer);
	public void deleteBuyer(@Param("buyerID") String id);
	public void updateBuyer(@Param("buyer") Buyer buyer);

}
