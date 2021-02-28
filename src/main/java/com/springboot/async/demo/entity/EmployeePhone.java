package com.springboot.async.demo.entity;

public class EmployeePhone {
	
	private String phoneNumber;

	public EmployeePhone() {
		
	}

	public EmployeePhone(String phoneNumber) {
		super();
		this.phoneNumber = phoneNumber;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "EmployeePhone [phoneNumber=" + phoneNumber + "]";
	}
	
	
	
	
	

}
