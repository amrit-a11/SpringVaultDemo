package com.example.springvaultdemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class SpringvaultdemoApplication {
	Logger logger = LoggerFactory.getLogger(SpringvaultdemoApplication.class);

	@Value("${demo.username}")
	private String username;

	@Value("${demo.password}")
	private String password;

	@PostConstruct
	private void postConstruct(){
		logger.info("=============================================");
		logger.info("Demo username from vault {}", username);
		logger.info("Demo password from vault {}", password);
		logger.info("=============================================");
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringvaultdemoApplication.class, args);
	}

}
