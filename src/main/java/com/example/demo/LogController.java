package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LogController {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(LogController.class);
	
	@GetMapping("/log")
	public String getName(@RequestParam(name = "name") String name) {
	
		LOGGER.info("I was logged : name={} | {} Good Job Supuni", name, name, name);
		return "Hi " + name + " How are You";
		
	}

}
