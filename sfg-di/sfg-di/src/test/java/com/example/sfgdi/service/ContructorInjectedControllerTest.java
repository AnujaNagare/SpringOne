package com.example.sfgdi.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.example.sfgdi.controllers.ConstructorInjectedController;
import com.example.sfgdi.services.GreetingServiceImpl;

class ContructorInjectedControllerTest {
	
	ConstructorInjectedController controller;

	@BeforeEach
	void setUp() {
		controller = new ConstructorInjectedController(new GreetingServiceImpl());		
	}
	
	@Test
	void getGreeting() {
		System.out.println(controller.getGreeting());

	}

}
