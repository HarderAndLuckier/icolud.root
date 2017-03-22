package com.icloud.model.user;

import java.util.Date;

public class User {

	private Integer id;
	private String userNaem;
	private Date birthday;
	private String sex;
	private String address;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUserNaem() {
		return userNaem;
	}
	public void setUserNaem(String userNaem) {
		this.userNaem = userNaem;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
}
