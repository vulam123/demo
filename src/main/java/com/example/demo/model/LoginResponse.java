package com.example.demo.model;

public class LoginResponse {
    String jwt;

	public LoginResponse(String jwt) {
		super();
		this.jwt = jwt;
	}

	public String getJwt() {
		return jwt;
	}

	public void setJwt(String jwt) {
		this.jwt = jwt;
	}
    
}
