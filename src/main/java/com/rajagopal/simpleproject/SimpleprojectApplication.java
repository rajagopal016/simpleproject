package com.rajagopal.simpleproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages={"com.rajagopal"})
public class SimpleprojectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimpleprojectApplication.class, args);
	}

}
