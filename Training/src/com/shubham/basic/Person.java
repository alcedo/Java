package com.shubham.basic;
import java.*;

import org.omg.CosNaming.NamingContextExtPackage.AddressHelper;
public class Person implements Cloneable /*Extends Objects*/ {

	private String name;
	private int age;
	private Address address;
	public Person() {
		// TODO Auto-generated constructor stub
	}
	public Person(String name, int age, Address a) {
		super();
		this.name = name;
		this.age = age;
		this.address = a;
	}
	
     @Override
    public Object clone() throws CloneNotSupportedException //deep copy
     {
    	// TODO Auto-generated method stub
    	 Person clonedPerson=(Person)super.clone();
    	 if(address!=null) {
    		 Address cloAdd=(Address)address.clone();
    		 clonedPerson.setAddress(cloAdd);
    		 }
    	return clonedPerson;
    }
     @Override
    protected void finalize() throws Throwable {
    	// TODO Auto-generated method stub
    	super.finalize();
    }


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", address=" + address + "]";
	}
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;


	}

}
