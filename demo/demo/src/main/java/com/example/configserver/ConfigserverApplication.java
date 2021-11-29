package com.example.configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigserverApplication  {

	public static void main(String[] args) {
		System.out.println("Hello world!");
		SpringApplication.run(ConfigserverApplication.class, args);
	}

	
}
