package com.infosys.OMS.UserService.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "buyer")
public class Buyer {
	
	@Id
	@Column(name="buyer_id")
	private String buyerId;
	private String name;
	private String email;
	@Column(name="phone_number")
	private String phoneNumber;
	private String password;
	@Column(name="is_privileged")
	private String isPrivileged;
	@Column(name="reward_points")
	private String rewardPoints;
	@Column(name="is_active")
	private String isActive;
	
	
	public String getBuyerId() {
		return buyerId;
	}
	public void setBuyerId(String buyerId) {
		this.buyerId = buyerId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getIsPrivileged() {
		return isPrivileged;
	}
	public void setIsPrivileged(String isPrivileged) {
		this.isPrivileged = isPrivileged;
	}
	public String getRewardPoints() {
		return rewardPoints;
	}
	public void setRewardPoints(String rewardPoints) {
		this.rewardPoints = rewardPoints;
	}
	public String getIsActive() {
		return isActive;
	}
	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}
	

}
