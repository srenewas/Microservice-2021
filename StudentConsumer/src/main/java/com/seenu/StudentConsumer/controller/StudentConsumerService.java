package com.seenu.StudentConsumer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class StudentConsumerService {
	
	@Autowired
	private DiscoveryClient client;
	@GetMapping("/consume")
	public String message() {
		RestTemplate rest = new RestTemplate();
		List<ServiceInstance> list = client.getInstances("STUDENT-PROVIDER");
		ResponseEntity<String> response = rest.getForEntity(list.get(0).getUri()+"/show",String.class);
		return "From Consumer"+response.getBody();
	}

}
