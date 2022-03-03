package com.backend.todolist.auth.controller;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class UserSignupRequest {
	@NotEmpty(message = "Username is required")
    private String username;
    
    @NotEmpty(message = "Password is required")
    @Size(min=8, message = "Password length should be 8 characters or more")
    private String password;
    
    protected UserSignupRequest() {
    	
    }

	public UserSignupRequest(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}

    
    
}
