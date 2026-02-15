package com.gaurav.typeofinheritance;

// Interface
interface Payments
{
	void pay(int amount);
}

// UPI Payment
class UPI implements Payments
{
	@Override
	public void pay(int amount) 
	{
		System.out.println("UPI Payment Successful : ₹" + amount);
	}
}

// Credit Card Payment
class Credit implements Payments
{
	@Override
	public void pay(int amount) 
	{
		System.out.println("Credit Card Payment Successful : ₹" + amount);
	}
}

// Cash Payment
class Cash implements Payments
{
	@Override
	public void pay(int amount) 
	{
		System.out.println("Cash Payment Successful : ₹" + amount);
	}
}

// Main Class
public class PaymentMultipleInheritance 
{
	public static void main(String[] args) 
	{
		Payments p;

		p = new UPI();
		p.pay(100000);

		p = new Credit();
		p.pay(100000);

		p = new Cash();
		p.pay(300000);
	}
}