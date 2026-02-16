package com.gaurav.typeofinheritance;

import java.util.Scanner;

class Bank
{
	Scanner sc = new Scanner(System.in);

	double bankBalance;
	String accountHolderName;

	void deposite()
	{
		System.out.print("Enter deposit amount: ");
		double amount = sc.nextDouble();

		if(amount > 0)
		{
			bankBalance += amount;
			System.out.println("Deposit successful!");
			System.out.println("Updated Balance: ₹" + bankBalance);
		}
		else
		{
			System.out.println("Invalid deposit amount");
		}
	}

	void withdraw()
	{
		System.out.print("Enter withdrawal amount: ");
		double amount = sc.nextDouble();

		if(amount > 0 && amount <= bankBalance)
		{
			bankBalance -= amount;
			System.out.println("Withdrawal successful!");
			System.out.println("Remaining Balance: ₹" + bankBalance);
		}
		else
		{
			System.out.println("Insufficient balance or invalid amount");
		}
	}
}

public class SBISingleInheritance extends Bank
{
	String branchName;
	String ifscCode;
	String accountNo;

	SBISingleInheritance(double bankBalance, String accountHolderName, String branchName, String ifscCode, String accountNo)
	{
		this.bankBalance = bankBalance;
		this.accountHolderName = accountHolderName;
		this.branchName = branchName;
		this.ifscCode = ifscCode;
		this.accountNo = accountNo;

		System.out.println("\n----- SBI ACCOUNT DETAILS -----");
		System.out.println("Account Holder : " + accountHolderName);
		System.out.println("Account Number : " + accountNo);
		System.out.println("Branch Name    : " + branchName);
		System.out.println("IFSC Code      : " + ifscCode);
		System.out.println("Opening Balance: ₹" + bankBalance);
		System.out.println("--------------------------------");
	}

	public static void main(String[] args)
	{
		SBISingleInheritance s1 = new SBISingleInheritance(5000, "Gaurav Patil", "Muktainagar", "SBIN0007776", "1010101010");
		
		Scanner sc = new Scanner(System.in);
		
		while(true)
		{
			System.out.println("\n--- BANK MENU ---");
			System.out.println("1. Deposit");
			System.out.println("2. Withdraw");
			System.out.print("Enter your choice: ");
			int choice = sc.nextInt();

			switch(choice)
			{
				case 1:
					s1.deposite();
					break;

				case 2:
					s1.withdraw();
					break;

				default:
					System.out.println("Invalid choice");
			}
		}
	}
}