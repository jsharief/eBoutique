package com.eBoutique.profile.services;

import java.util.Optional;

import com.eBoutique.profile.model.Profile;
/**
 * 
 * @author eBoutique.in
 *
 */
public interface ProfileService {
	
	public void createProfile(Profile pProfile);
	
	public Optional<Profile> isProfileExist(Profile profile); 

}
