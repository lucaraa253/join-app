package com.training.spring;

public class Body {
	private String message;

	public Body(String message) {
		super();
		this.message = message;
	}
	
	public Body() {
		
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "Body [message=" + message + "]";
	}
	
	
}
