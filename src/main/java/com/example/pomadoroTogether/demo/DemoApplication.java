package com.example.pomadoroTogether.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args)
	{
		SpringApplication.run(DemoApplication.class, args);
	}

	@GetMapping("/food")//this is the address to reach "favFood", i.e. http://localhost:8080/food
	public String favFood(@RequestParam(value = "food", defaultValue = "Plain Bread") String food)//format: http://localhost:8080/food?=<insert value here>
	{
		return ("Your favorite food is : " + food);
	}

}
