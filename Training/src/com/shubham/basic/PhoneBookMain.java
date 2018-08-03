package com.shubham.basic;

public class PhoneBookMain {
	public static void main(String[] args) {
		PhoneBook p= new MyPhoneBook("Shubham",5);
		p.add("Shubham", "7208277045", "Singhalshubham89@gmail.cxm");
		p.add("asfdgsafd", "888888", "1asdadcsjkbsad@g.com");
		p.add("Shubham", "7208277045", "Singhalshubham89@gmail.cxm");
		p.add("Shub", "8888888888", "Singhasnbkaca89@gmail.cxm");
		p.display();

		Entry[] e=p.search("1");
		if(e.length!=0)
		{
			System.out.println(e.length +" found in search result");
			p.display(e);
		}
		else
			System.out.println("0 found in search result");
		
	}
}
