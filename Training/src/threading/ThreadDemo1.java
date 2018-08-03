package threading;

public class ThreadDemo1 {

	class Task1 implements Runnable{

		@Override
		public void run() {
			// TODO Auto-generated method stub
			for (int i=0;i<100000;i++)
			{
				System.out.println("i is "+i);
			}
		}	
	}
	class Task2 implements Runnable{

		@Override
		public void run() {
			// TODO Auto-generated method stub
			for (int i=0;i<100000;i++)
			{
				System.out.println("\tj is "+i);
			}
		}	
	}
	void launch() {
		Thread th1=new Thread(new Task1());
		Thread th2=new Thread (new Task2());
		Runnable r=()->{
			for (int i=0;i<100000;i++)
			{
				System.out.println("\t\tk is "+i);
			}
		};
		Thread th3=new Thread(r);
		th1.setDaemon(true);
		th2.setDaemon(true);
		th3.setDaemon(true);
		//th1.setPriority(Thread.MIN_PRIORITY);
		//th2.setPriority(Thread.NORM_PRIORITY);
		//th3.setPriority(Thread.MAX_PRIORITY);
		th1.start();
		th2.start();
		th3.start();
	}
	public static void main(String[] args) {
		new ThreadDemo1().launch();
	}
}
