package com.springboot.async.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.async.demo.contract.EmployeeAddresses;
import com.springboot.async.demo.contract.EmployeeNames;
import com.springboot.async.demo.contract.EmployeePhones;
import com.springboot.async.demo.entity.EmployeeAddress;
import com.springboot.async.demo.entity.EmployeeName;
import com.springboot.async.demo.entity.EmployeePhone;

@RestController
public class EmployeeController {
	
	private static Logger log = LoggerFactory.getLogger(EmployeeController.class);
	
	@GetMapping(path = "/employees/addresses")
	public EmployeeAddresses getAddresses(){
		
		log.info("Get address starts");
		EmployeeAddresses addresses = new EmployeeAddresses();
		List<EmployeeAddress> addressList = new ArrayList<EmployeeAddress>();
		
		EmployeeAddress emp1 = new EmployeeAddress();
		emp1.setHouseNumber("h01");
		emp1.setStreetNumber("s01");
		emp1.setZipCode("z01");
		addressList.add(emp1);
		
		EmployeeAddress emp2 = new EmployeeAddress();
		emp1.setHouseNumber("h02");
		emp1.setStreetNumber("s02");
		emp1.setZipCode("z02");
		addressList.add(emp2);
		
		EmployeeAddress emp3 = new EmployeeAddress();
		emp1.setHouseNumber("h03");
		emp1.setStreetNumber("s03");
		emp1.setZipCode("z03");
		addressList.add(emp3);
		
		addresses.setEmployeeAddresses(addressList);
		return addresses;
		
			
	}
	
	@GetMapping(path = "/employees/names")
	public EmployeeNames getNames() {
		
		log.info("Get employee names starts");
		EmployeeNames names = new EmployeeNames();
		
		List<EmployeeName> nameList = new ArrayList<EmployeeName>();
		
		EmployeeName emp1 = new EmployeeName();
		emp1.setName("Swati");
		nameList.add(emp1);
		
		EmployeeName emp2 = new EmployeeName();
		emp1.setName("Sagar");
		nameList.add(emp2);
		
		EmployeeName emp3 = new EmployeeName();
		emp1.setName("Aparna");
		nameList.add(emp3);
		
		names.setEmployeeNames(nameList);
		return names;
	}
	
	@GetMapping(path = "/employees/phoneNumbers")
	public EmployeePhones getPhoneNumbers() {
		
		log.info("Get phone number starts");
		
		EmployeePhones phoneNumbers = new EmployeePhones();
		
		List<EmployeePhone> phoneNumberList = new ArrayList<EmployeePhone>();
		
		EmployeePhone emp1 = new EmployeePhone();
		emp1.setPhoneNumber("9008193069");
		phoneNumberList.add(emp1);
		
		EmployeePhone emp2 = new EmployeePhone();
		emp2.setPhoneNumber("9782427497");
		phoneNumberList.add(emp2);
		
		EmployeePhone emp3 = new EmployeePhone();
		emp3.setPhoneNumber("90081673069");
		phoneNumberList.add(emp3);
		
		phoneNumbers.setPhoneNumbers(phoneNumberList);
		return phoneNumbers;
	}

}
