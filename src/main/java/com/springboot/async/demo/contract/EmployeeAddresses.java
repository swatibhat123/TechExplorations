package com.springboot.async.demo.contract;

import java.util.List;

import com.springboot.async.demo.entity.EmployeeAddress;

public class EmployeeAddresses {
	
	private List<EmployeeAddress> employeeAddresses ;

	public List<EmployeeAddress> getEmployeeAddresses() {
		return employeeAddresses;
	}

	public void setEmployeeAddresses(List<EmployeeAddress> employeeAddresses) {
		this.employeeAddresses = employeeAddresses;
	}

	@Override
	public String toString() {
		return "EmployeeAddresses [employeeAddresses=" + employeeAddresses + "]";
	}
	

}
