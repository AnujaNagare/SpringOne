package com.example.sfgdi.controllers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.example.sfgdi.services.GreetingService;

@Controller
public class ConstructorInjectedController {

	private final GreetingService greetingService;

	
	public ConstructorInjectedController(@Qualifier("constructorGreetingService")GreetingService greetingService) {
		this.greetingService = greetingService;
	}

	public String getGreeting() {
		return greetingService.sayGreeting();
	}


}
