package com.shubham.basic;

public interface MobileApplication {

		public abstract void start();
		public abstract void pause();
		public abstract void stop();
		
		//java 8 onwards , non abstract and static method is also allowed
		public default String info() //we have an option to override info method 
		{
			return "Development by Google Inc";
		}
}
