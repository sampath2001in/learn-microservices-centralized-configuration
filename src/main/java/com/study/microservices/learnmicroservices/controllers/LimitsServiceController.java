package com.study.microservices.learnmicroservices.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.study.microservices.learnmicroservices.beans.Limits;
import com.study.microservices.learnmicroservices.conf.LimitsConfiguration;

@RestController
public class LimitsServiceController {
	
	@Autowired
	private LimitsConfiguration limitsConf;
	
	@GetMapping("/limits-service")
	public Limits getLimits() {
		//return new Limits(1, 999);
		return new Limits(limitsConf.getMinimum(), limitsConf.getMaximum());
	}

}
