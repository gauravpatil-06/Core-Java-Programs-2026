package com.gaurav.polymorphism;

public class UserDetailsOverloading 
{
	void show(int id, String name)
	{
		System.out.println("User ID      : " + id);
		System.out.println("User Name    : " + name);
		System.out.println("---------------------------");
	}
	
	void show(int id, String name, String email)
	{
		System.out.println("User ID      : " + id);
		System.out.println("User Name    : " + name);
		System.out.println("User Email   : " + email);
		System.out.println("---------------------------");
	}
	
	void show(int id, String name, String email, String mobileNo)
	{
		System.out.println("User ID      : " + id);
		System.out.println("User Name    : " + name);
		System.out.println("User Email   : " + email);
		System.out.println("Mobile No    : " + mobileNo);
		System.out.println("---------------------------");
	}
	
	void show(int id, String name, String email, String mobileNo, String username, String password)
	{
		System.out.println("User ID      : " + id);
		System.out.println("User Name    : " + name);
		System.out.println("User Email   : " + email);
		System.out.println("Mobile No    : " + mobileNo);
		System.out.println("Username     : " + username);
		System.out.println("Password     : " + password);
		System.out.println("---------------------------");
	}
	
	public static void main(String[] args) 
	{
		UserDetailsOverloading u1 = new UserDetailsOverloading();
		
		u1.show(101, "Gaurav Patil");
		u1.show(101, "Gaurav Patil", "gaurav@gmail.com");
		u1.show(101, "Gaurav Patil", "gaurav@gmail.com", "7875335539");
		u1.show(101, "Gaurav Patil", "gaurav@gmail.com", "7875335539", "gauravpatil", "Gaurav@123");
	}
}