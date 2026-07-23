package com.Basic.dto;

public class CreateUserRequest {
	private String userName;
	private Integer age;
	public CreateUserRequest(String userName, Integer age) {

		this.userName = userName;
		this.age = age;
	}
	
	public CreateUserRequest() {
	}

	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	
	
}
