package com.shubham.basic;

public class MyMobileApplication implements MobileApplication{

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("My mobile Application started....");
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		System.out.println("My mobile Application paused....");
		
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("My mobile Application stopped....");
	}

}
