package com.eBoutique.profile.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.eBoutique.profile.model.Profile;

import io.micrometer.core.ipc.http.HttpSender.Response;

@RestController
public class TestServiceController {

	@GetMapping("/test/{name}")
	public String getMessage(@PathVariable String name) {
		
		
		return "Hello " + name;
		
	}
	
	
	@GetMapping("/customer/{id}")
	public Profile getCustomer(@PathVariable String id) {
		
		Profile user = new Profile();
		user.setExternalId("LYL11123");
		user.setFirstName("Jalaludeen");
		user.setLastName("Hameed Sharief");
		return user; 
		
	}
	
	@PostMapping(path="/customer/create",consumes = "application/json" , produces = "application/json")
	public String addCustomer(@RequestBody Profile profile) {
		
		System.out.println("Profile");
		
		System.out.println(profile.getFirstName());
		System.out.println(profile.getLastName());
		
		return "created" ;
		
	}
	
}


