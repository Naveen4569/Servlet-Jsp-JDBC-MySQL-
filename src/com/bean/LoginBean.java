package com.bean;


import java.io.Serializable;
public class LoginBean implements Serializable{

	
    
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	

	private String username;
    private String password;
    private String name;
    private String email;
    private String country;

    public String getUsername() {
        return username;
    }
    public String getName() {
        return name;
    }

    public void setUsername(String username) {
        this.username = username;
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
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
