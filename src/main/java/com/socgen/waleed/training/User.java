package com.socgen.waleed.training;

public class User {
	private Integer userId;

	private String userName;

	private String userAddress;

	User() {

	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", userAddress=" + userAddress + "]";
	}

	public User(Integer userId, String userName, String userAddress) {
		this.userId = userId;
		this.userName = userName;
		this.userAddress = userAddress;
	}
	
	public User(String userName, String userAddress) {
		this.userName = userName;
		this.userAddress = userAddress;
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

	public String getUserAddress() {
		return userAddress;
	}

	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}

}
