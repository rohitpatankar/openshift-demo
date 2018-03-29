package com.example.greeting;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class GreetingController {
	
	private String greetingServerURL;
	
	
	
	public GreetingController(@Value("${GREETING_SVC_URL:}") String greetingServerURL) {
		super();
		this.greetingServerURL = greetingServerURL;
	}



	@RequestMapping("greetings/{username}")
	String greetings(@PathVariable("username") String username) {
		return new RestTemplate().getForEntity(greetingServerURL + "/" + username, String.class).getBody();
	}

}