package com.backend.todolist.controller;

import java.util.Date;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import lombok.Data;
@Data
public class TodoUpdateRequest {
	@NotEmpty(message = "Title is required")
	private String title;

	@NotNull(message = "Target date is required")
	private Date targetDate;
	
	protected TodoUpdateRequest() {
		
	}

	public TodoUpdateRequest(String title, Date targetDate) {
		super();
		this.title = title;
		this.targetDate = targetDate;
	}


}
