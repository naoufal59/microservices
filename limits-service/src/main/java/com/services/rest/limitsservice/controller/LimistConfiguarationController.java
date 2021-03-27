package com.services.rest.limitsservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.services.rest.limitsservice.Configuration;
import com.services.rest.limitsservice.beans.LimitConfiguration;

@RestController
public class LimistConfiguarationController {
	@Autowired
	private Configuration conf;
	@GetMapping("/limits")
	public LimitConfiguration retriveLimitsFromConfiguaration() {
		return new LimitConfiguration(conf.getMaximum(), conf.getMinimum());
	}
}
