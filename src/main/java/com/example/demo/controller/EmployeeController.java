package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	
	@GetMapping("/data")
	public String getBadData() {
		return "don't code like this!";
	}
	
	@GetMapping("/team")
	public String teamName() {
		return "alpha";
	}

}
