package com.example.sfgdi.service;

import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.example.sfgdi.controllers.PropertyInjectedController;
import com.example.sfgdi.services.GreetingServiceImpl;

class PropertyInjectedControllerTest {
	
	PropertyInjectedController controller;

	@BeforeEach
	void setUp() {
		controller = new PropertyInjectedController();
		
		controller.greetingService =new GreetingServiceImpl();
		
	}
	
	@Test
	void getGreeting() {
		System.out.println(controller.getGreeting());

	}

}
