package com.springboot.async.demo.contract;

import java.util.List;

import com.springboot.async.demo.entity.EmployeeName;

public class EmployeeNames {
	
	private List<EmployeeName> employeeNames;

	public List<EmployeeName> getEmployeeNames() {
		return employeeNames;
	}

	public void setEmployeeNames(List<EmployeeName> employeeNames) {
		this.employeeNames = employeeNames;
	}

	@Override
	public String toString() {
		return "EmployeeNames [employeeNames=" + employeeNames + "]";
	}
	
	
	
	

}
