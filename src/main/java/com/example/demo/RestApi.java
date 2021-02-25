package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class RestApi {
	
	@RequestMapping("/")
	public String hello() {
		return "welcome to automate tomcat git ";
	}

}
