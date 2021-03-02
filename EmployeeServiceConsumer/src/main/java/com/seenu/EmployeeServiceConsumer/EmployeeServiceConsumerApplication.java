package com.seenu.EmployeeServiceConsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class EmployeeServiceConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeServiceConsumerApplication.class, args);
	}
}
