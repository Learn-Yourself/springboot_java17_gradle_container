package com.cloud.webapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.TestConfiguration;

@TestConfiguration(proxyBeanMethods = false)
public class TestWebappApplication {

	public static void main(String[] args) {
		SpringApplication.from(WebappApplication::main).with(TestWebappApplication.class).run(args);
	}

}
