package com.RestfulWebservices.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greetController")
public class GreetController {

	@GetMapping("/Greet")
	public String greet() {
		String msg = "Good Morning  Vivekanand  College";

		return msg;

	}
	@GetMapping("/Greet1")
	public String greet1() {
		String msg = "Good Morning  Deogiri  College";

		return msg;
		}
}
