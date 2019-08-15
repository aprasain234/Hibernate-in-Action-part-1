package com.ashishprasain.hibernate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class Users {

	@Id
	@Column(name = "user_id")
	int userId;
	@Column(name = "username")
	String username;
	@Column(name = "password")
	String password;
	@Column(name = "first_name")
	String first_name;
	@Column(name = "last_name")
	String last_name;
	
	//constructors
	public Users(String username, String password, String first_name, String last_name) {
		this.username = username;
		this.password = password;
		this.first_name = first_name;
		this.last_name = last_name;
	}
	//getters and setters 
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

}
