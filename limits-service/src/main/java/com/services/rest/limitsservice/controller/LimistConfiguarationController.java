package com.services.rest.limitsservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.services.rest.limitsservice.beans.LimitConfiguration;

@RestController
public class LimistConfiguarationController {
	@GetMapping("/limits")
	public LimitConfiguration retriveLimitsFromConfiguaration() {
		return new LimitConfiguration(199, 1);
	}
}
