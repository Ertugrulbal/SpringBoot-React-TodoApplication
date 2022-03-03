package com.backend.todolist.auth.controller;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserSigninResponse {
	private String username;
	private String token;
	
	
}
