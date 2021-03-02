package com.seenu.StudentServiceProvider.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentService {
	@GetMapping("/show")
	public String show() {
		return "Hello From StudentProvider";
	}
}
