package com.springboot.async.demo.contract;

import java.util.List;

import com.springboot.async.demo.entity.EmployeePhone;

public class EmployeePhones {
	
	private List<EmployeePhone> phoneNumbers;

	public List<EmployeePhone> getPhoneNumbers() {
		return phoneNumbers;
	}

	public void setPhoneNumbers(List<EmployeePhone> phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
	}

	@Override
	public String toString() {
		return "EmployeePhones [phoneNumbers=" + phoneNumbers + "]";
	}

	

}
