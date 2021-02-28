package com.springboot.async.demo.entity;

public class EmployeeAddress {
	
	private String houseNumber;
	private String streetNumber;
	private String zipCode;
	public EmployeeAddress() {
		
	}
	public EmployeeAddress(String houseNumber, String streetNumber, String zipCode) {
		super();
		this.houseNumber = houseNumber;
		this.streetNumber = streetNumber;
		this.zipCode = zipCode;
	}
	public String getHouseNumber() {
		return houseNumber;
	}
	public void setHouseNumber(String houseNumber) {
		this.houseNumber = houseNumber;
	}
	public String getStreetNumber() {
		return streetNumber;
	}
	public void setStreetNumber(String streetNumber) {
		this.streetNumber = streetNumber;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	@Override
	public String toString() {
		return "EmployeeAddress [houseNumber=" + houseNumber + ", streetNumber=" + streetNumber + ", zipCode=" + zipCode
				+ "]";
	}
	
	
	
	

}
