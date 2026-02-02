package com.gaurav.accessmodifiers;

public class PrivateAccessModifier
{
	// Private instance variable
	private int id = 101;
	
	// Private constructor
	private PrivateAccessModifier()
	{
		System.out.println("PrivateAccessModifier object created");
	}
	
	// Private method
	private void display()
	{
		System.out.println("Display method called");
		System.out.println("Student ID: " + id);
	}
	
	public static void main(String[] args) 
	{
		PrivateAccessModifier p1 = new PrivateAccessModifier();
		p1.id = 102;
		p1.display();
	}
}
