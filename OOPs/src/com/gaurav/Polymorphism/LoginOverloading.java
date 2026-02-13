package com.gaurav.polymorphism;

import java.util.Scanner;

public class LoginOverloading 
{
	Scanner sc = new Scanner(System.in);
	
	void login()
	{
		int otp = (int) (Math.random() * 1000000);
		System.out.println("OTP: " + otp);
		  
		System.out.print("Enter your OTP: ");
		int userOtp = sc.nextInt();
		
		if(userOtp == otp)
		{
			System.out.println("Login Successful");
		}
		else
		{
			System.err.println("Login Failed");
		}
	}
	
	void login(String username, String password)
	{
		System.out.print("Enter your username: ");
		username = sc.next();
		
		System.out.print("Enter your password: ");
		password = sc.next();
		
		if(username.equals("gauravpatil") && password.equals("Gaurav@123"))
		{
			System.out.println("Login Successful");
		}
		else
		{
			System.err.println("Login Failed");
		}
	}
	
	public static void main(String[] args) 
	{
		LoginOverloading l1 = new LoginOverloading();
		
		l1.login();
		l1.login("gauravpatil", "Gaurav@123");
	}
}