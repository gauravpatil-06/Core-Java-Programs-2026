package com.gaurav.classes;

public class StudentUsingTypesofMethods 
{
	// Method without parameters and without return type
	void display()
	{
		System.out.println("Display method executed successfully");
	}
	
	// Method with parameters and without return type
	void show(String name, int age)
	{
		System.out.println("Student Name : " + name);
		System.out.println("Student Age  : " + age);
	}
	
	// Method without parameters and with return type
	int getNumber()
	{
		int number = 100;
		return number;
	}
	
	// Method with parameters and with return type
	int add(int a, int b)
	{
		return a + b;
	}
	
	public static void main(String[] args) 
	{
		// Creating object of the class
		StudentUsingTypesofMethods s1 = new StudentUsingTypesofMethods();
		
		// Calling method without parameter and return type
		s1.display();
		
		System.out.println("---------------------------");
		
		// Calling method with parameters and without return type
		s1.show("Gaurav Patil", 19);
		
		System.out.println("---------------------------");
		
		// Calling method without parameter and with return type
		int num = s1.getNumber();
		System.out.println("Returned Number : " + num);
		
		System.out.println("---------------------------");
		
		// Calling method with parameters and with return type
		int sum = s1.add(10, 20);
		System.out.println("Addition of Two Numbers : " + sum);
	}
}