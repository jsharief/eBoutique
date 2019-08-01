package com.eBoutique.profile.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestServiceController {

	@GetMapping("/test/{name}")
	public String getMessage(@PathVariable String name) {
		
		
		return "Hello " + name;
		
	}
}
