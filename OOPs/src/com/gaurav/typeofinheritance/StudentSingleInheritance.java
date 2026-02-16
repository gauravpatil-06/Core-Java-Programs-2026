package com.gaurav.typeofinheritance;

import java.util.Scanner;

class Person
{
	Scanner sc = new Scanner(System.in);
	
	String name;
	int age;
	
	void accept()
	{
		System.out.print("Enter Name: ");
		name = sc.next();
		
		System.out.print("Enter Age: ");
		age = sc.nextInt();
	}
}

public class StudentSingleInheritance extends Person
{
	int id;
	String collegeName;
	
	void getData()
	{
		System.out.print("Enter Student ID: ");
		id = sc.nextInt();
		
		System.out.print("Enter College Name: ");
		collegeName = sc.next();
	}
	
	void display()
	{
		System.out.println("\n----- Student Details -----");
		System.out.println("Name         : " + name);
		System.out.println("Age          : " + age);
		System.out.println("Student ID   : " + id);
		System.out.println("College Name : " + collegeName);
	}
	
	public static void main(String[] args) 
	{
		StudentSingleInheritance s1 = new StudentSingleInheritance();
		
		s1.accept();     // Parent class method
		s1.getData();    // Child class method
		s1.display();    // Display all details
	}
}