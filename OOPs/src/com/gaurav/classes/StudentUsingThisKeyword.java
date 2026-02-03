package com.gaurav.classes;

public class StudentUsingThisKeyword 
{
	int id;
	String name;
	double marks;
	
	void setData(int id, String name, double marks)
	{
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	
	void display()
	{
		System.out.println("Student ID    : " + id);
		System.out.println("Student Name  : " + name);
		System.out.println("Student Marks : " + marks);
	}
	
	public static void main(String[] args)
	{
		StudentUsingThisKeyword s1 = new StudentUsingThisKeyword();
		s1.setData(101, "Gaurav", 93.81);
		
		System.out.println("Student 1 Details:");
		s1.display();
		
		System.out.println("-----------------------");
		
		StudentUsingThisKeyword s2 = new StudentUsingThisKeyword();
		s2.setData(102, "Patil", 94.00);
		
		System.out.println("Student 2 Details:");
		s2.display();
	}
}
