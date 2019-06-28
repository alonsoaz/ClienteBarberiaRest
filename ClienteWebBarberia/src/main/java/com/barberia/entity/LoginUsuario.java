package com.barberia.entity;

import java.io.Serializable;

public class LoginUsuario implements Serializable{
	
	private String aaka;
	private String bpass;

	public LoginUsuario(String aaka, String bpass) {
		super();
		this.aaka = aaka;
		this.bpass = bpass;
	}
	
	public String getAaka() {
		return aaka;
	}
	public void setAaka(String aaka) {
		this.aaka = aaka;
	}
	public String getBpass() {
		return bpass;
	}
	public void setBpass(String bpass) {
		this.bpass = bpass;
	}
	

}
