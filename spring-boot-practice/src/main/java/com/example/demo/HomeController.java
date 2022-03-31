package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	@RequestMapping("/welcome")
	public String welcome() {
		return "Welcome to revature JWA Batch";
	}
	
	@RequestMapping("/")
	public String index() {
		return "Welcome to index page";
	}
	@RequestMapping("/home")
	public String home() {
		return "Welcome to home page";
	}
	
	
}
