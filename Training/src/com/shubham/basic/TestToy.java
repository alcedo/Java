package com.shubham.basic;

public class TestToy {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Battery [] b1= new Battery[5];
		for(int i=0;i<5;i++)
		{
			b1[i]=new Battery(i);
		}
		for(int i=0;i<5;i++)
		{
			System.out.println(b1[i]);
		}
		Toy t1= new Toy(b1);
		Toy t2=(Toy) t1.clone();
		System.out.println(t1.toString());
		System.out.println(t2.toString());
		
		
		for(int i=0;i<5;i++)
		{
			t2.getB()[i].setB_no(i+3);
		}
		
		System.out.println(t1.toString());
		System.out.println(t2.toString());

		Toy t3= new Toy(5);
		System.out.println(t3.toString());
	}

}
