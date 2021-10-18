package com.example.sfgdi.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.stereotype.Controller;

import com.example.sfgdi.controllers.SetterInjectedController;
import com.example.sfgdi.services.GreetingServiceImpl;

class SetterInjectedControllerTest {
	
	
	SetterInjectedController controller;

	@BeforeEach
	void setUp() {
		controller = new SetterInjectedController();
		
		controller.setGreetingService(new GreetingServiceImpl());
		
	}
	
	@Test
	void getGreeting() {
		System.out.println(controller.getGreeting());

	}

}
