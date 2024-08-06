package com.example.jenkins.mypack;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class JenkisDemoFirstApplication {

	public static Logger logger = LoggerFactory.getLogger(JenkisDemoFirstApplication.class);
	
	public static void main(String[] args) {
		logger.info("<================Starting to execute main method====================>");
		SpringApplication.run(JenkisDemoFirstApplication.class, args);
		logger.info("<================main method executed successfully====================>");
	}
	
	@PostConstruct
	public void initialization() {
		logger.info("<================Starting to execute main initialization() ====================>");
	}

}
