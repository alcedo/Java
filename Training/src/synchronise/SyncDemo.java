package synchronise;

class Account
{
	int acno;
	double balance;
	
	public Account(int acno, double balance) 
	{
		this.acno = acno;
		this.balance = balance;
	}
	
	synchronized void withdraw(double amount) throws InterruptedException 
	{
		//Thread.sleep(100);
		
		if(amount < balance)
		{
			//Thread.sleep(100);
			balance-=amount;
			//Thread.sleep(100);
			System.out.println("Balance left : "+balance);
		}
		else
		{
			System.out.println("Insufficient Balance");
		}
	}
	
}

class Transaction implements Runnable
{
	Account account;
	
	public Transaction(Account account)
	{
		this.account = account;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			account.withdraw(4500);
		} catch (InterruptedException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
public class SyncDemo 
{
	public static void main(String[] args) 
	{
		Account acc = new Account(111, 5500);
		Transaction tx1=new Transaction(acc);
		Transaction tx2=new Transaction(acc);
		Thread th1=new Thread(tx1);
		Thread th2=new Thread(tx2);
		th1.start();
		th2.start();
	}
	
		
}
