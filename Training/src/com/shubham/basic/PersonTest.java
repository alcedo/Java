package com.shubham.basic;

public class PersonTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Person p1=new Person("Shubham",22);
		System.out.println(p1.toString());
		Person p2=new Person("Shubham",22);
		
		System.out.println(p1==p2);
		System.out.println(p1.equals(p2));
		System.out.println(p1.toString().equals(p2.toString()));//performance wise not good logic
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		
		Person p3=(Person) p1.clone();//clone is protected member
		System.out.println(p3);
		p1=p2=null; //now object is eligible to garbage collector
		System.gc();//calling garbage collector
		
		//not to used in production just use for testing
		// SHALLOW CONE (Object is refering to same memory location )//reference is copyied in internal rather than goinfg deep**********************
		Address a= new Address("Mumbai",400708);
		Person p4=new Person("Shubham",23,a);
		
		Person p5=(Person)p4.clone();//default value of clone is shallow copy
		System.out.println(p4.getAddress().getCity());
		System.out.println(p5.getAddress().getCity());
		p5.getAddress().setCity("Pune");
		System.out.println(p4.getAddress().getCity());
		System.out.println(p5.getAddress().getCity());

	}

}
