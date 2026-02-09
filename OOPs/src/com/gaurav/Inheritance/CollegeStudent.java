package com.gaurav.inheritance;

class Student
{
	void study()
	{
		System.out.println("Student is studying");
	}
	
	void attendClass()
	{
		System.out.println("Student is attending the class");
	}
}

public class CollegeStudent extends Student
{
	public static void main(String[] args) 
	{
		CollegeStudent c1 = new CollegeStudent();
		c1.study();
		c1.attendClass();
	}
}