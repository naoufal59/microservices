package com.services.rest.limitsservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LimitsServiceApplication {

	public static void main(String[] args) {
//		 System.setProperty("server.servlet.context-path", "/limits-service");
		SpringApplication.run(LimitsServiceApplication.class, args);
	}

}
