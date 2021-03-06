package countdownlatch;

import java.util.concurrent.CountDownLatch;

public class LatchDemo 
{
	CountDownLatch latch=new CountDownLatch(2);
	class Task1 implements Runnable
	{
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			System.out.println("Task1 begins....");
			try {
				latch.await();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Task1 ends....");
		}
		
	}
	class Task2 implements Runnable
	{
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			System.out.println("Task2 begins....");
			System.out.println("Task1 ends....");
			latch.countDown();
		}
		
	}
	class Task3 implements Runnable
	{
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			System.out.println("Task3 begins....");
			System.out.println("Task3 ends....");
			latch.countDown();
		}
		
	}
	void launch()
	{
		new Thread(new Task1()).start();
		new Thread(new Task2()).start();
		new Thread(new Task3()).start();
		
	}
	public static void main(String[] args) {
	   new LatchDemo().launch();; 
	}
}
