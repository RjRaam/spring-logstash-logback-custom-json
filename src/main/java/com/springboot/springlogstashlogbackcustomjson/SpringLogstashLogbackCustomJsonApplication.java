package com.springboot.springlogstashlogbackcustomjson;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class SpringLogstashLogbackCustomJsonApplication {
	private static final Logger logger = LoggerFactory.getLogger(SpringLogstashLogbackCustomJsonApplication.class);

	public static void main(String[] args) {
		// MDC not required, just to show how can we add additional MDC level object
		MDC.put("App-Name", "Logback custom Json App");
		SpringApplication.run(SpringLogstashLogbackCustomJsonApplication.class, args);
		logger.info("Application started");
	}

}
