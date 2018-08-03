package com.shubham.basic;

public class Launcher {

		public void launch(MobileApplication mobileApp) {
			mobileApp.start();
			mobileApp.pause();
			mobileApp.stop();
			System.out.println(mobileApp.info());
		}
}
