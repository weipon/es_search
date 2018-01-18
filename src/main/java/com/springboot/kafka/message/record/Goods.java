package com.springboot.kafka.message.record;
/**
* @author WeiPeng Li
*/
public class Goods {
	private Long goodsId;
	private String goodsName;
	private Long brandSid;
	private String brandName ;
	public Long getGoodsId() {
		return goodsId;
	}
	public void setGoodsId(Long goodsId) {
		this.goodsId = goodsId;
	}
	public String getGoodsName() {
		return goodsName;
	}
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}
	public Long getBrandSid() {
		return brandSid;
	}
	public void setBrandSid(Long brandSid) {
		this.brandSid = brandSid;
	}
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	
}
