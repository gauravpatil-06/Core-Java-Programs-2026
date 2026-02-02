package com.gaurav.accessmodifiers;

public class PublicAccessModifier 
{
	// Public instance variable (accessible everywhere)
	public int id = 101;
	
	// Public constructor
	public PublicAccessModifier()
	{
		System.out.println("PublicAccessModifier object created");
	}
	
	// Public method
	public void display()
	{
		System.out.println("Display method called");
		System.out.println("Student ID: " + id);
	}
}