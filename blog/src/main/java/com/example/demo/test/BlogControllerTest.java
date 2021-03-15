package com.example.demo.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BlogControllerTest {
	
	//http://localhost:8181/text/hello
	@GetMapping("/text/hello")
	public String hell() {
		return "<h1>hello spring boot</h1>";
	}
}
