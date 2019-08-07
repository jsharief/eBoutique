package com.eBoutique.profile.services;

import java.util.Date;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.eBoutique.profile.model.Profile;
import com.eBoutique.profile.repository.ProfileRepository;

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
	
	/**
	 * 
	 * @param profile
	 * @return
	 */
	public Optional<Profile> isProfileExist(Profile profile) {
		 
		Optional<Profile> optional = ((ProfileRepository)profileRepository).findByEmail(profile.getLogin());
		 
		return optional;
		
	}

}
