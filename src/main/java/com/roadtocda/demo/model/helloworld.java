package com.roadtocda.demo.model;

public class helloworld {
	
	private String message = "hello world";
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
		
	}
	@Override
	public String toString() {
		return message;
	}
 
}
