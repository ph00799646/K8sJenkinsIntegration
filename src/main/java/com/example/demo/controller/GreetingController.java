package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
	
	@GetMapping("sayHello")
	public String sayHello() {
		return  "It is wowrking fine Herambha !";
	}

	@Override
	public String toString() {
		return "GreetingController []";
	}

}
