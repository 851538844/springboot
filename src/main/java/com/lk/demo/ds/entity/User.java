package com.lk.demo.ds.entity;

import java.io.Serializable;

public class User implements Serializable {
	private static final long serialVersionUID = 508004049742742591L;
	private String userName;
	private String age;
	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	private String passWord;
	

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

}
