package com.gaurav.typeofinheritance;

class Payment
{
	int amount;

	Payment(int amount)
	{
		this.amount = amount;
	}
}

// Child class – UPI
class UPIPayment extends Payment
{
	UPIPayment(int amount)
	{
		super(amount);
		System.out.println("UPI Payment Successfully Done : ₹" + amount);
	}
}

// Child class – Debit Card
class DebitPayment extends Payment
{
	DebitPayment(int amount)
	{
		super(amount);
		System.out.println("Debit Card Payment Successfully Done : ₹" + amount);
	}
}

// Child class – Credit Card
class CreditPayment extends Payment
{
	CreditPayment(int amount)
	{
		super(amount);
		System.out.println("Credit Card Payment Successfully Done : ₹" + amount);
	}
}

// Child class – Cash
class CashPayment extends Payment
{
	CashPayment(int amount)
	{
		super(amount);
		System.out.println("Cash Payment Successfully Done : ₹" + amount);
	}
}

public class PaymentHierarchicalInheritance
{
	public static void main(String[] args)
	{
		Payment p;

		p = new UPIPayment(10000);
		p = new DebitPayment(20000);
		p = new CreditPayment(30000);
		p = new CashPayment(40000);
	}
}