package com.springboot.async.demo.service;

import java.util.concurrent.CompletableFuture;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.springboot.async.demo.contract.EmployeeAddresses;
import com.springboot.async.demo.contract.EmployeeNames;
import com.springboot.async.demo.contract.EmployeePhones;

@Service
public class AsyncService {
	
	private static Logger log = LoggerFactory.getLogger(AsyncService.class);
	 
    @Autowired
    private RestTemplate restTemplate;
 
    @Async("asyncExcecutor")
    public CompletableFuture<EmployeeAddresses> getEmployeeAddresses() throws InterruptedException{
    	
    	log.info("Get addresses async method starts here");
    	
    	EmployeeAddresses addresses = restTemplate.getForObject("http://localhost:8080/employees/addresses",EmployeeAddresses.class );
    	log.info("employee address{}", addresses);
        Thread.sleep(1000L);    //Intentional delay
        log.info("employee address completed");
        return CompletableFuture.completedFuture(addresses);
    	
    }
    
    @Async("asyncExcecutor")
    public CompletableFuture<EmployeeNames> getEmployeeNames() throws InterruptedException{
    	
    	log.info("Get names async method starts here");
    	
    	EmployeeNames names = restTemplate.getForObject("http://localhost:8080/employees/names",EmployeeNames.class );
    	log.info("employee address{}", names);
        Thread.sleep(1000L);    //Intentional delay
        log.info("employee names completed");
        return CompletableFuture.completedFuture(names);
    	
    }
    
    @Async("asyncExcecutor")
    public CompletableFuture<EmployeePhones> getEmployeePhoneNumbers() throws InterruptedException{
    	
    	log.info("Get phone numbers async method starts here");
    	
    	EmployeePhones phoneNumbers = restTemplate.getForObject("http://localhost:8080/employees/phoneNumbers",EmployeePhones.class );
    	log.info("employee address{}", phoneNumbers);
        Thread.sleep(1000L);    //Intentional delay
        log.info("employee names completed");
        return CompletableFuture.completedFuture(phoneNumbers);
    	
    }


}
