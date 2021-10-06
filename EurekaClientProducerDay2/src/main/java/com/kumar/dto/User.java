package com.kumar.dto;

public class User {

	private Integer userId;
	private String userName;
	private String phoneNumber;

	public User(Integer userId, String userName, String phoneNumber) {
		this.userId = userId;
		this.userName = userName;
		this.phoneNumber = phoneNumber;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	

}
