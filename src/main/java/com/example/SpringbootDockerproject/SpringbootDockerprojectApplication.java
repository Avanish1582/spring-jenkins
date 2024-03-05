package com.example.SpringbootDockerproject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootDockerprojectApplication {
	@GetMapping("/message")
	public String getMessage() {
		return "Docker Tutorial";
	}
	
	Logger logger = LoggerFactory.getLogger(SpringbootDockerprojectApplication.class);

	public void init() {
		logger.info("Application Startrd..");
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SpringbootDockerprojectApplication.class, args);
	}

}
