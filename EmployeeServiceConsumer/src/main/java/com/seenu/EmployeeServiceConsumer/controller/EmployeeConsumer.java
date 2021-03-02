package com.seenu.EmployeeServiceConsumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.seenu.EmployeeServiceConsumer.proxy.EmployeeproviderProxy;

@RestController
public class EmployeeConsumer {
	@Autowired
	private EmployeeproviderProxy client;
	
	@GetMapping("/display")
	public String display() {
		System.out.println(client.getClass().getName());
		return "from emp consumer-->"+client.show()+client.hello();
	}
}
