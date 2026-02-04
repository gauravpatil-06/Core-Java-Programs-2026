package com.gaurav.classes;

import java.util.Scanner;

public class StudentUsingTypesofVariables 
{
	// Instance Variables (Object-level variables)
	int id;
	String name;
	double marks;
	
	// Static Variable (Class-level variable - shared by all objects)
	static String collegeName = "D. Y. Patil College of Engineering, Akurdi, Pune";
	
	// Scanner object (Instance variable)
	Scanner sc = new Scanner(System.in);
	
	void add()
	{
		// Local Variables (Method-level variable - Used only inside this method)
		int a, b;
		
		System.out.print("Enter First Number: ");
		a = sc.nextInt();
		
		System.out.print("Enter Second Number: ");
		b = sc.nextInt();
		
		System.out.println("Addition of Two Numbers: " + (a + b));
		System.out.println("---------------------------------\n");
	}
	
	void accept(int id, String name, double marks)
	{
		// Assigning values to instance variables using this keyword
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	
	void display()
	{
		System.out.println("Student ID     : " + id);
		System.out.println("Student Name   : " + name);
		System.out.println("Student Marks  : " + marks);
		System.out.println("College Name   : " + collegeName);
		
		System.out.println("---------------------------------");
	}
	
	public static void main(String[] args) 
	{
		// Creating object of the class
		StudentUsingTypesofVariables s1 = new StudentUsingTypesofVariables();
		
		// Calling methods
		s1.add();
		s1.accept(101, "Gaurav Patil", 99.99);
		s1.display();
	}
}