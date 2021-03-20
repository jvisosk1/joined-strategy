package com.mycompany;

import javax.persistence.*;

@Entity
// @DiscriminatorValue(value = "1")
public class Student extends Person {
 
	private String email;
 	private String gradLevel;

	public String getEmail()
		{return email;}
	public void setEmail(String email)
		{this.email = email;}

	public String getGradLevel()
		{return gradLevel;}
	public void setGradLevel(String gradLevel)
		{this.gradLevel = gradLevel;}
 
}