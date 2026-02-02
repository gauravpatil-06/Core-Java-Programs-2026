package com.gaurav.accessmodifiers;

public class ProtectedAccessModifier
{
	// Protected instance variable
	protected int id = 101;
	
	// Protected constructor
	protected ProtectedAccessModifier()
	{
		System.out.println("ProtectedAccessModifier object created");
	}
	
	// Protected method
	protected void display()
	{
		System.out.println("Display method called");
		System.out.println("Student ID: " + id);
	}
}
