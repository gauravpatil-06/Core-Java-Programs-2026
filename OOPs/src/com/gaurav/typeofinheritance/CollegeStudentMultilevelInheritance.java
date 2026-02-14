package com.gaurav.typeofinheritance;

// Level 1 - Parent Class
class Human
{
	String name;
	int age;

	Human(String name, int age)
	{
		this.name = name;
		this.age = age;
	}

	void displayHuman()
	{
		System.out.println("Name : " + name);
		System.out.println("Age  : " + age);
	}
}

// Level 2 - Child Class
class Student extends Human
{
	int id;
	int rollNo;

	Student(String name, int age, int id, int rollNo)
	{
		super(name, age);
		this.id = id;
		this.rollNo = rollNo;
	}

	void displayStudent()
	{
		System.out.println("Student ID   : " + id);
		System.out.println("Roll Number  : " + rollNo);
	}
}

// Level 3 - Child of Student (Multilevel)
public class CollegeStudentMultilevelInheritance extends Student
{
	String collegeName;

	CollegeStudentMultilevelInheritance(String name, int age, int id, int rollNo, String collegeName)
	{
		super(name, age, id, rollNo);
		this.collegeName = collegeName;
	}

	void displayCollegeStudent()
	{
		displayHuman();     // from Human
		displayStudent();  // from Student
		System.out.println("College Name : " + collegeName);
	}

	public static void main(String[] args)
	{
		CollegeStudentMultilevelInheritance c1 = new CollegeStudentMultilevelInheritance("Gaurav Patil", 19, 101, 257, "DY Patil College of Engineering Akurdi, Pune");

		System.out.println("----- College Student Details -----");
		c1.displayCollegeStudent();
	}
}