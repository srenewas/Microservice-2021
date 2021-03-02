package com.seenu.StudentServiceProvider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
public class StudentServiceProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentServiceProviderApplication.class, args);
	}

}
