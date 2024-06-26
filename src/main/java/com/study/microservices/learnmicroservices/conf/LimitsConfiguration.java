package com.study.microservices.learnmicroservices.conf;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix="limits-service")
//@ConfigurationProperties(prefix="learn-microservices")
public class LimitsConfiguration {


	public int getMinimum() {
		return minimum;
	}
	public void setMinimum(int minimum) {
		this.minimum = minimum;
	}
	public int getMaximum() {
		return maximum;
	}
	public void setMaximum(int maximum) {
		this.maximum = maximum;
	}
	private int minimum;
	private int maximum;

	
}
