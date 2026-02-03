package com.gaurav.classes;

public class StudentUsingMethods
{
	int id;
	String name;
	double marks;
	
	void setData(int i, String s, double m)
	{
		id = i;
		name = s;
		marks = m;
	}
	
	void display()
	{
		System.out.println("Student ID    : " + id);
		System.out.println("Student Name  : " + name);
		System.out.println("Student Marks : " + marks);
	}
	
	public static void main(String[] args)
	{
		StudentUsingMethods s1 = new StudentUsingMethods();
		s1.setData(101, "Gaurav", 93.81);
		
		System.out.println("Student 1 Details:");
		s1.display();
		
		System.out.println("-----------------------");
		
		StudentUsingMethods s2 = new StudentUsingMethods();
		s2.setData(102, "Patil", 94.00);
		
		System.out.println("Student 2 Details:");
		s2.display();
	}
}