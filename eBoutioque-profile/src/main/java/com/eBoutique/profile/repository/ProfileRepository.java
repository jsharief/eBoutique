package com.eBoutique.profile.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.eBoutique.profile.model.Profile;

@Repository
public interface ProfileRepository extends JpaRepository<Profile, Long > {
	
	
	@Query("SELECT u FROM Profile u WHERE u.login = ?1")

	public Optional<Profile> findByEmail(String login);
	
}


