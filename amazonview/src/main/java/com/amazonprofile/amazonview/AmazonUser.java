package com.amazonprofile.amazonview;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="newamazonuser")
public class AmazonUser {

	private String name;
	private String password;
	
	@Id//for primary key
	private String email;
	private long phnnumber;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getNumber() {
		return phnnumber;
	}
	public void setNumber(long number2) {
		this.phnnumber = number2;
	}
	
	
}
