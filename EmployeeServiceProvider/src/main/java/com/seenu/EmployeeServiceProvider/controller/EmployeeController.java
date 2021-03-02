package com.seenu.EmployeeServiceProvider.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	@GetMapping("/show")
	public String show() {
		return "From Employee Provider............";
	}
}
