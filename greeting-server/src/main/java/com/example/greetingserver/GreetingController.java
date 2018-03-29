package com.example.greetingserver;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
	
	@RequestMapping("greetings/{username}")
	String greetings(@PathVariable("username") String username) {
		return String.format("Hello World V1 %s!\n", username);
	}

}