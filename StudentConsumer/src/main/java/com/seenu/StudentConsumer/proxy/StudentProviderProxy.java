package com.seenu.StudentConsumer.proxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("STUDENT-PROVIDER")
public interface StudentProviderProxy {
	@GetMapping("/show")
	public String show();

}
