package com.shubham.basic;

public class Entry {
	private String name;
	private String number;
	private String email;
	public Entry() {
		// TODO Auto-generated constructor stub
	}
	public Entry(String name, String number, String email) {
		super();
		this.name = name;
		this.number = number;
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
