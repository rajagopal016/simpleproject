package com.rajagopal.controller;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.RestController;  
@RestController  
public class MyController {
	@RequestMapping("/")  
	public String hello()   
	{  
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
		LocalDateTime now = LocalDateTime.now();  
		System.out.println(dtf.format(now));  
		return "Time now in US EAST is " + dtf.format(now);  
	}  
	@RequestMapping("/welcome")  
	public String welcome()   
	{  
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
		LocalDateTime now = LocalDateTime.now();  
		System.out.println(dtf.format(now));  
		return "Time now in US EAST is " + dtf.format(now);  
	}  


}
