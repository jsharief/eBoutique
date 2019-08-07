package com.eBoutique.profile.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.TableGenerator;

/**
 * 
 * @author eBoutique.in
 *
 */
@Entity

@TableGenerator(name="tab", initialValue=0, allocationSize=50)
public class Profile {

	/**
	 * 
	 */
	@Id
	@GeneratedValue(strategy=GenerationType.TABLE, generator="tab")
	private Long id;
	
	/**
	 * 
	 */
	
	private String externalId;
	
	/**
	 * 
	 */
	private String firstName;
	
	/**
	 * 
	 */
	private String lastName;
	
	/**
	 * 
	 */
	private Date registrationDate;
	
	
	/**
	 *  
	 */
	private  String login;
	
	
	/**
	 * 
	 */
	
	private String password;
	
	/**
	 * 
	 */
	@Column(columnDefinition="tinyint(1) default 1")
	private boolean isActive;
	
	
	public Profile() {
		// TODO Auto-generated constructor stub
	}



	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}



	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}



	/**
	 * @return the externalId
	 */
	public String getExternalId() {
		return externalId;
	}



	/**
	 * @param externalId the externalId to set
	 */
	public void setExternalId(String externalId) {
		this.externalId = externalId;
	}



	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}



	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}



	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}



	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}



	/**
	 * @return the registrationDate
	 */
	public Date getRegistrationDate() {
		return registrationDate;
	}



	/**
	 * @param registrationDate the registrationDate to set
	 */
	public void setRegistrationDate(Date registrationDate) {
		this.registrationDate = registrationDate;
	}



	/**
	 * @return the login
	 */
	public String getLogin() {
		return login;
	}



	/**
	 * @param login the login to set
	 */
	public void setLogin(String login) {
		this.login = login;
	}



	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}



	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}



	/**
	 * @return the isActive
	 */
	public boolean isActive() {
		return isActive;
	}



	/**
	 * @param isActive the isActive to set
	 */
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	
	
	
	

}
