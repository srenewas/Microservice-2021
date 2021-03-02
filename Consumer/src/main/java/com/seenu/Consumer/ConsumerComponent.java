package com.seenu.Consumer;

import org.springframework.boot.CommandLineRunner;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class ConsumerComponent implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		RestTemplate r = new RestTemplate();
		ResponseEntity<String> response = r.getForEntity("http://localhost:8000/Admin/show", String.class);
		System.out.println(response.getBody());
		System.out.println("HI SEENU IGLESIAS.................");
		System.exit(0);
		
	}

}
