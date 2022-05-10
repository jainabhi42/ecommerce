package com.example.demo.domain;

import java.io.Serializable;

import com.example.demo.entity.UserDetails;

public class UserRequestDomain implements Serializable  {
	 private static final long serialVersionUID = 278460773818020488L;
	 
	private String userName;
	 public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public int getActive() {
		return active;
	}
	public void setActive(int active) {
		this.active = active;
	}
	public UserDetailsRequestDomain getUserDetails() {
		return userDetails;
	}
	public void setUserDetails(UserDetailsRequestDomain userDetails) {
		this.userDetails = userDetails;
	}
	private String userPassword;
	 private int active;
	 private UserDetailsRequestDomain userDetails;

}
