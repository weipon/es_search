package com.springboot.kafka.message.record;

import java.util.List;

/**
* @author WeiPeng Li
*/
public class OrderRecord {
	/**
	 * 订单编号
	 * */
    private String orderNo;
	/**
	 * 用户Id
	 * */
    private String userId;
    
	/**
	 * 商品集合
	 * */
    private List<Goods> goodsList;
    
	public String getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public List<Goods> getGoodsList() {
		return goodsList;
	}

	public void setGoodsList(List<Goods> goodsList) {
		this.goodsList = goodsList;
	}



    
}
