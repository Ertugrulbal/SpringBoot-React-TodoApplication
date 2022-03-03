package com.backend.todolist.auth.controller;

import lombok.Data;

@Data
public class UserSigninRequest {
    private String username;
    
    private String password;
    
    protected UserSigninRequest() {
    	
    }

	public UserSigninRequest(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}

    
    
}
