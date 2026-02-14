package com.gaurav.typeofinheritance;

import java.util.Scanner;

/* ---------- PARENT CLASS ---------- */
class Banks {
	Scanner sc = new Scanner(System.in);

	double bankBalance;
	String accountHolderName;
	String branchName;
	String ifscCode;
	String accountNo;

	Banks(double bankBalance, String accountHolderName, String branchName, String ifscCode, String accountNo) {
		this.bankBalance = bankBalance;
		this.accountHolderName = accountHolderName;
		this.branchName = branchName;
		this.ifscCode = ifscCode;
		this.accountNo = accountNo;
	}

	void deposit() {
		System.out.print("Enter deposit amount: ₹");
		double amount = sc.nextDouble();

		if (amount > 0) {
			bankBalance += amount;
			System.out.println("Amount deposited successfully");
		} else {
			System.out.println("Invalid deposit amount");
		}
	}

	void withdraw() {
		System.out.print("Enter withdrawal amount: ₹");
		double amount = sc.nextDouble();

		if (amount > 0 && amount <= bankBalance) {
			bankBalance -= amount;
			System.out.println("Amount withdrawn successfully");
		} else {
			System.out.println("Insufficient balance or invalid amount");
		}
	}

	void display() {
		System.out.println("\n----- ACCOUNT DETAILS -----");
		System.out.println("Account Holder : " + accountHolderName);
		System.out.println("Account Number : " + accountNo);
		System.out.println("Branch Name    : " + branchName);
		System.out.println("IFSC Code      : " + ifscCode);
		System.out.println("Balance        : ₹" + bankBalance);
		System.out.println("---------------------------");
	}
}

/* ---------- CHILD CLASS 1 ---------- */
class SBI extends Banks {
	SBI(double bal, String name, String branch, String ifsc, String accNo) {
		super(bal, name, branch, ifsc, accNo);
	}
}

/* ---------- CHILD CLASS 2 ---------- */
class RBI extends Banks {
	RBI(double bal, String name, String branch, String ifsc, String accNo) {
		super(bal, name, branch, ifsc, accNo);
	}
}

/* ---------- CHILD CLASS 3 ---------- */
class Axis extends Banks {
	Axis(double bal, String name, String branch, String ifsc, String accNo) {
		super(bal, name, branch, ifsc, accNo);
	}
}

/* ---------- MAIN CLASS ---------- */
public class BankHierarchicalInheritance {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Choose ONE bank at a time

		Banks bank = new SBI(5000, "Gaurav Patil", "Muktainagar SBI Branch", "SBIN0007776", "1010101010");

		/*
		 * Bank bank = new RBI( 10000, "Gaurav Patil", "Pune RBI Branch", "RBIN0001234",
		 * "2020202020" );
		 * 
		 * Bank bank = new Axis( 8000, "Gaurav Patil", "Akurdi Axis Branch",
		 * "AXIS0004567", "3030303030" );
		 */

		int choice;

		do {
			System.out.println("\n----- BANK MENU -----");
			System.out.println("1. Deposit");
			System.out.println("2. Withdraw");
			System.out.println("3. Display Account Details");
			System.out.println("4. Exit");
			System.out.print("Enter your choice: ");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				bank.deposit();
				break;

			case 2:
				bank.withdraw();
				break;

			case 3:
				bank.display();
				break;

			case 4:
				System.out.println("Thank you for using Banking Service");
				break;

			default:
				System.out.println("Invalid choice, please try again");
			}

		} while (choice != 4);
	}
}