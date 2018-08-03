package com.shubham.basic;
import com.shubham.basic.A;
public class B extends A{
	
		// TODO Auto-generated constructor stub
		Integer x=20;
	
	
	void print()
	{
		System.out.println("HelloB");
	}
	public static void main(String[] args) {
		A a=new B();
		System.out.println(a.x); //compile time binding
		a.print();//run time binding
	}
}
