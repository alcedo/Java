package com.shubham.basic;

public class Battery implements Cloneable{
	private int B_no;
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	public Battery(int b_no) {
		super();
		B_no = b_no;
	}

	@Override
	public String toString() {
		return "Battery [B_no=" + B_no + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + B_no;
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
		Battery other = (Battery) obj;
		if (B_no != other.B_no)
			return false;
		return true;
	}

	public int getB_no() {
		return B_no;
	}

	public void setB_no(int b_no) {
		B_no = b_no;
	}

}
