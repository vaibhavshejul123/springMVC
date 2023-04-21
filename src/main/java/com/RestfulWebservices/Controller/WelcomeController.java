package com.RestfulWebservices.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/welcomeController")
public class WelcomeController {

	@GetMapping("/Welcome")
	public String welcome() {
		String msg="Welcome To The Vivekanand College";
		return msg;
		
	}
	
	@GetMapping("/Welcome1")
	public String welcome1() {
		String msg="Welcome To The Deogiri College";
		return msg;
		
	}
}
