package com.space.SPACEAPPLICATION;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.fasterxml.jackson.core.util.DefaultPrettyPrinter.Indenter;

@Entity
public class User {

	@Id
	private Integer id;
	private String password;
	private String username;
	public User(Integer id, String password, String username) {
		super();
		this.id = id;
		this.password = password;
		this.username = username;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	
}
