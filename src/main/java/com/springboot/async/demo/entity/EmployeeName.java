package com.springboot.async.demo.entity;

public class EmployeeName {
	private String name;

	public EmployeeName() {
	
	}
	
	public EmployeeName(String name) {
		super();
		this.name = name;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "EmployeeName [name=" + name + "]";
	}
	
	

}
