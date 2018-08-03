package com.shubham.basic;

public class Color {

	private int r;
	private int g;
	private int b;
	public Color(int r, int g, int b) {
		super(); //makes a call to parent class constructor
		this.r = r;
		this.g = g;
		this.b = b;
	}
	public Color() {
		// TODO Auto-generated constructor stub
	}
	public int getR() {
		return r;
	}
	public void setR(int r) {
		this.r = r;
	}
	public int getG() {
		return g;
	}
	public void setG(int g) {
		this.g = g;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
}
