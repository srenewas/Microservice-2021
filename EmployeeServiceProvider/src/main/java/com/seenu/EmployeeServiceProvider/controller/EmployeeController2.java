package com.seenu.EmployeeServiceProvider.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController2 {
	@GetMapping("/hello")
	public String hello() {
		return "Hello From Employee Provider Controller2...";
	}
}
