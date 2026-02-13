package com.gaurav.polymorphism;

public class StudentOverloading 
{
	void study()
	{
		System.out.println("Student is studying using Laptop");
	}
	
	void study(int hours)
	{
		System.out.println("Student is studying using Mobile for " + hours + " hours");
	}
	
	void study(String device)
	{
		System.out.println("Student is studying using " + device);
	}
	
	void study(int pages, int notebooks)
	{
		System.out.println("Student is studying using " + notebooks + " notebooks and " + pages + " pages");
	}
	
	void study(int hours, String device)
	{
		System.out.println("Student is studying for " + hours + " hours using " + device);
	}
	
	public static void main(String[] args) 
	{
		StudentOverloading s1 = new StudentOverloading();
		
		s1.study();
		System.out.println("------------------------------------------");
		
		s1.study(3);
		System.out.println("------------------------------------------");
		
		s1.study("Tablet");
		System.out.println("------------------------------------------");
		
		s1.study(50, 2);
		System.out.println("------------------------------------------");
		
		s1.study(5, "Laptop");
		System.out.println("------------------------------------------");
	}
}