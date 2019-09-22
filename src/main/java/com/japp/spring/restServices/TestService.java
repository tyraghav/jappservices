package com.japp.spring.restServices;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestService {
	
	@GetMapping("/getMyService")
	String TestService() {
		return "OOOAAA";
	}
}
