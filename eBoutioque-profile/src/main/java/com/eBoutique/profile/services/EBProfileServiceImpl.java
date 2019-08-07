package com.eBoutique.profile.services;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.eBoutique.profile.model.Profile;

/**
 * @author mk
 *
 */
@Service
public class EBProfileServiceImpl implements ProfileService {
	
	/**
	 * 
	 */
	@Autowired
	JpaRepository<Profile, Long> profileRepository;
	
	/**
	 * 
	 */
	@Override
	public void createProfile(Profile pProfile) {
		pProfile.setRegistrationDate(new Date());
		profileRepository.save(pProfile);
		 
	}

}
