package com.seenu.EmployeeServiceConsumer.proxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="EMPLOYEE-PROVIDER")
public interface EmployeeproviderProxy {
	@GetMapping("/show")
	public String show();
	@GetMapping("/hello")
	public String hello();
}
