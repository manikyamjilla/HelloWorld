package com.jilla;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

	//http://localhost:8080/hello
	@GetMapping("/hello")
	public String getMessage() {
		return "Hello World";
	}
	
	@GetMapping("/world")
	public String getMessageWorld() {
		return "Hello World-jilla";
	}
	
	
}
