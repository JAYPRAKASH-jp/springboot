package com.spring.crud.Springboot.CRUD.models;

import java.io.Serializable;

public class MessageResponse implements Serializable {
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}	

}
