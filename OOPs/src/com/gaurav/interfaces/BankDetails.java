package com.gaurav.interfaces;

interface Bank
{
	void pay(int amount);
}

class SBI implements Bank
{
	@Override
	public void pay(int amount)
	{
		System.out.println("SBI Bank Payment Successful");
		System.out.println("Paid Amount: ₹" + amount);
		System.out.println("---------------------------");
	}
}

class Axis implements Bank
{
	@Override
	public void pay(int amount)
	{
		System.out.println("Axis Bank Payment Successful");
		System.out.println("Paid Amount: ₹" + amount);
		System.out.println("---------------------------");
	}
}

class Central implements Bank
{
	@Override
	public void pay(int amount)
	{
		System.out.println("Central Bank Payment Successful");
		System.out.println("Paid Amount: ₹" + amount);
		System.out.println("---------------------------");
	}
}

public class BankDetails 
{
	public static void main(String[] args) 
	{
		Bank b1;
		
		b1 = new SBI();
		b1.pay(10000);
		
		b1 = new Axis();
		b1.pay(20000);
		
		b1 = new Central();
		b1.pay(30000);
	}
}