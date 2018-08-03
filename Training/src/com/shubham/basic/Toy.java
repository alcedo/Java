package com.shubham.basic;

import java.util.Arrays;

public class Toy implements Cloneable {
	
	Battery [] b;	
	int counter=5;
	public Toy(Battery[] b) {
		super();
		this.b = b;
	}
	public Toy(int size) {
		// TODO Auto-generated constructor stub
		b=new Battery[size];
		for(int i=0;i<size;i++)
		{
			this.b[i]=new Battery(i);
		}
		counter=size;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Toy clonedToy= (Toy)super.clone();
		Battery []cloned_b =new Battery[counter];
		for(int i=0;i<counter;i++)
		{
			if(b[i]!=null)
			{
				cloned_b[i]=(Battery)b[i].clone();	
			}
		}
		 clonedToy.setB(cloned_b);
		
		return clonedToy;
	}
	@Override
	public String toString() {
		return "Toy [b=" + Arrays.toString(b) + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(b);
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
		Toy other = (Toy) obj;
		if (!Arrays.equals(b, other.b))
			return false;
		return true;
	}
	public Battery[] getB() {
		return b;
	}
	public void setB(Battery[] b) {
		this.b = b;
	}

}
