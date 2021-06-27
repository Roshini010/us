package com.infosys.OMS.UserService.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@Table(name = "wishlist")
@IdClass(WishListId.class)
public class WishList {
	@Id
	@Column(name="buyer_id")
	private String buyerId;
	@Id
	@Column(name="prod_id")
	private String productId;
	
	
	public String getBuyerId() {
		return buyerId;
	}
	public void setBuyerId(String buyerId) {
		this.buyerId = buyerId;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	
	
}
