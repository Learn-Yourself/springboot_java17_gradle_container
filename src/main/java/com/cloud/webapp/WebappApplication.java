package com.cloud.webapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
public class WebappApplication {
	
	@GetMapping("/")
	String home() {
		return "Srikanth is here! test it";
	}

	public static void main(String[] args) {
		SpringApplication.run(WebappApplication.class, args);
	}

}
