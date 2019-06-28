package com.barberia.entity;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MessagenID  implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@JsonProperty
	private String message;
	@JsonProperty	
	private int ID;
	
	public MessagenID(String message, int iD) {
		super();
		this.message = message;
		ID = iD;
	}


	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	
	

}
