package org.test.struts;

import org.apache.struts.action.ActionForm;

public class UserActionForm extends ActionForm {
	private String username;
	private String password;
	private int userpay;
	private int age;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getUserpay() {
		return userpay;
	}
	public void setUserpay(int userpay) {
		this.userpay = userpay;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	

}
