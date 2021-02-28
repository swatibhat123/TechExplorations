package com.springboot.async.demo.controller;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.async.demo.contract.EmployeeAddresses;
import com.springboot.async.demo.contract.EmployeeNames;
import com.springboot.async.demo.contract.EmployeePhones;
import com.springboot.async.demo.service.AsyncService;

@RestController
public class AsyncController {
	
	private static Logger log = LoggerFactory.getLogger(AsyncController.class);
	
	@Autowired
	private AsyncService asyncService;
	
	@RequestMapping(value = "/testAsynch", method = RequestMethod.GET)
    public void testAsynch() throws InterruptedException, ExecutionException 
    {
        log.info("testAsynch Start");
 
        CompletableFuture<EmployeeAddresses> employeeAddress = asyncService.getEmployeeAddresses();
        CompletableFuture<EmployeeNames> employeeName = asyncService.getEmployeeNames();
        CompletableFuture<EmployeePhones> employeePhone = asyncService.getEmployeePhoneNumbers();
 
        // Wait until they are all done
        CompletableFuture.allOf(employeeAddress, employeeName, employeePhone).join();
         
        log.info("EmployeeAddress--> " + employeeAddress.get());
        log.info("EmployeeName--> " + employeeName.get());
        log.info("EmployeePhone--> " + employeePhone.get());
    }
	

}
