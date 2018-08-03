package com.shubham.basic;

public class BankAccount {
	private int acno;
	private double balance;
	public BankAccount(int acno, double balance) {
		this.acno = acno;
		this.balance = balance;
	}
	public double withdraw(double amount) throws BankAccountException
	{
		if(amount>balance)
		{
			 BankAccountException e= new  BankAccountException("Insufficient Balance");
			throw e;
		}
		else
		{
			balance-=amount;
			return balance;
		}
		
	}
	public static void main(String[] args) {
		BankAccount bankAcc= new BankAccount(1, 1000);
		try {
			double balance=bankAcc.withdraw(2000);
			System.out.println("Balance Left "+balance);
		} catch (BankAccountException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}

}
