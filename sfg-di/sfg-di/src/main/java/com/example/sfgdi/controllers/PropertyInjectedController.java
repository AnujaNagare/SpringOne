package com.example.sfgdi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.example.sfgdi.services.GreetingService;

@Controller
public class PropertyInjectedController {

	@Autowired
	@Qualifier("propertyInjectedGreetingService")
	public GreetingService greetingService;

	public String getGreeting() {
		return greetingService.sayGreeting();
	}

}
