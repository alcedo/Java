package com.shubham.basic;

public interface PhoneBook {
	public void display();
	public void add(String name,String number,String email);
	public void display(Entry[] e);
	public Entry[] search(String name);
}
