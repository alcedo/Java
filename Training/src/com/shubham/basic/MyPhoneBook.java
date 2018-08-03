package com.shubham.basic;

import com.shubham.basic.OptimizeDisplayAssignment;

public class MyPhoneBook implements PhoneBook {
	private String name;
	private Entry[] entries;
	private int counter;
	public MyPhoneBook() {
		this.name="My PhoneBook";
		this.entries= new Entry[100];
		counter=0;
	}
	public MyPhoneBook(String name, int noOfEntries) {
		this.name=name;
		this.entries=new Entry[noOfEntries];
		counter=0;
	}
	@Override
	public void add(String name,String number,String email)
	{
		entries[counter]= new Entry(name, number, email);
		counter++;
	}
	@Override
	public void display()
	{

		OptimizeDisplayAssignment.colNames= new String []{"Name","Number","Email"};
		OptimizeDisplayAssignment.data =new String[counter][OptimizeDisplayAssignment.colNames.length];
		for(int i=0;i<counter;i++)
		{
			OptimizeDisplayAssignment.data[i]= new String []{entries[i].getName(),entries[i].getNumber(),entries[i].getEmail()};

		}
		//	    System.out.println(OptimizeDisplayAssignment.data.length);
		//	    System.out.println(OptimizeDisplayAssignment.data[0].length);
		OptimizeDisplayAssignment.maxLength();
		OptimizeDisplayAssignment.displayLine('+','-');
		OptimizeDisplayAssignment.displayData('|',' ',OptimizeDisplayAssignment.colNames);
		OptimizeDisplayAssignment.displayLine('+','-');
		//OptimizeDisplayAssignment.data;


		for(int i=0;i<counter;i++)
		{
			OptimizeDisplayAssignment.displayData('|', ' ',OptimizeDisplayAssignment.data[i]);
		}
		OptimizeDisplayAssignment.displayLine('+','-');	
	}
	@Override
	public void display(Entry[] e)
	{
		int counter=e.length;
		OptimizeDisplayAssignment.colNames= new String []{"Name","Number","Email"};
		OptimizeDisplayAssignment.data =new String[counter][OptimizeDisplayAssignment.colNames.length];
		for(int i=0;i<counter;i++)
		{
			OptimizeDisplayAssignment.data[i]= new String []{e[i].getName(),e[i].getNumber(),e[i].getEmail()};

		}
		//	    System.out.println(OptimizeDisplayAssignment.data.length);
		//	    System.out.println(OptimizeDisplayAssignment.data[0].length);
		OptimizeDisplayAssignment.maxLength();
		OptimizeDisplayAssignment.displayLine('+','-');
		OptimizeDisplayAssignment.displayData('|',' ',OptimizeDisplayAssignment.colNames);
		OptimizeDisplayAssignment.displayLine('+','-');
		//OptimizeDisplayAssignment.data;


		for(int i=0;i<counter;i++)
		{
			OptimizeDisplayAssignment.displayData('|', ' ',OptimizeDisplayAssignment.data[i]);
		}
		OptimizeDisplayAssignment.displayLine('+','-');	
	}
	@Override
	public Entry[] search(String name)
	{
		int c=0;
		for(int i=0;i<counter;i++)
		{
			if(entries[i].getName().toLowerCase().contains(name.toLowerCase()))
			{
				c++;
			}
		}
		Entry[] e1 =new Entry[c] ;
		c=0;
		for(int i=0;i<counter;i++)
		{
			if(entries[i].getName().toLowerCase().contains(name.toLowerCase()))
			{
				e1[c]=entries[i];
				c++;
			}
		}
		return e1;

	}

}
