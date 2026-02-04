package com.gaurav.classes;

public class StudentUsingVariables
{
	// Instance variables (Global variables for the object)
	int id;
	String name;
	double marks;

	public static void main(String[] args)
	{
		// Reference variable and object creation
		StudentUsingVariables s1 = new StudentUsingVariables();
		s1.id = 101;
		s1.name = "Gaurav";
		s1.marks = 93.81;

		System.out.println("Student 1 Details:");
		System.out.println("ID    : " + s1.id);
		System.out.println("Name  : " + s1.name);
		System.out.println("Marks : " + s1.marks);

		System.out.println("-------------------");

		StudentUsingVariables s2 = new StudentUsingVariables();
		s2.id = 102;
		s2.name = "Patil";
		s2.marks = 94.00;

		System.out.println("Student 2 Details:");
		System.out.println("ID    : " + s2.id);
		System.out.println("Name  : " + s2.name);
		System.out.println("Marks : " + s2.marks);
	}
}