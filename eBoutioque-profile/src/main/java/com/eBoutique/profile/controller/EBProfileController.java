package com.eBoutique.profile.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eBoutique.profile.model.Profile;
/**
 * 
 * @author eBoutique.in
 *
 */
import com.eBoutique.profile.services.ProfileService;
@RestController
@RequestMapping("/eBoutique")
public class EBProfileController {
	
	
	@Autowired
	ProfileService ebProfileService;
	
	
	public EBProfileController() {
		// TODO Auto-generated constructor stub
	}
	
	
	@PostMapping(path = "/profile/create",consumes = "application/json", produces="application/json")
	public ResponseEntity<Object> createProfile(@RequestBody Profile pProfile) {
		
		Optional<Profile> optional = ebProfileService.isProfileExist(pProfile);
		
		ResponseEntity<Object> responseEntity = null;
		
		if (optional.isPresent()) {
			responseEntity =  new ResponseEntity<>("Profile Already  exist",HttpStatus.BAD_REQUEST);
		} else {
			
			ebProfileService.createProfile(pProfile);
			
			responseEntity = new ResponseEntity<>("Profile Created Sucessfully",HttpStatus.CREATED);
		};
		
		return responseEntity;
		
	}

}
