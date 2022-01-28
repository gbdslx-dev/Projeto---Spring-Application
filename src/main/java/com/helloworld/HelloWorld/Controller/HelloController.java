package com.helloworld.HelloWorld.Controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping ("Hello")
public class HelloController {
	@GetMapping 
	public String hello() {
		return "Hello Generation!";
	}

}
