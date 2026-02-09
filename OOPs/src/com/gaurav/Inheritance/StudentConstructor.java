package com.gaurav.inheritance;

class SchoolStudent
{
	int id;
	String name;
	double marks;

	SchoolStudent(int id, String name, double marks)
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
}

public class StudentConstructor extends SchoolStudent
{
	StudentConstructor(int id, String name, double marks)
	{
		super(id, name, marks);
	}

	public static void main(String[] args)
	{
		StudentConstructor s1 = new StudentConstructor(101, "Gaurav Patil", 99.99);

		s1.display();
	}
}