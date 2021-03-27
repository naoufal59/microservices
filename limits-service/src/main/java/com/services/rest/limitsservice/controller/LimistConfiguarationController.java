package com.services.rest.limitsservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.services.rest.limitsservice.Configuration;
import com.services.rest.limitsservice.beans.LimitConfiguration;

@RestController
public class LimistConfiguarationController {
	@Autowired
	private Configuration configuration;

	@GetMapping("/limits")
	public LimitConfiguration retrieveLimitsFromConfigurations() {
		LimitConfiguration limitConfiguration = new LimitConfiguration(configuration.getMaximum(),
				configuration.getMinimum());
		return limitConfiguration;
	}
}
