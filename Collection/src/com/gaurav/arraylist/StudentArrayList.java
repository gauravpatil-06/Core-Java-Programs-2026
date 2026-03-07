package com.gaurav.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class StudentArrayList 
{
	public static void main(String[] args) 
	{
//		Student s1 = new Student(101, "Gaurav", 93.81, 19, "Pune");
//		Student s2 = new Student(102, "Vinod", 88.45, 20, "Sambhaji Nagar");
//		Student s3 = new Student(103, "Bhagyesh", 91.20, 19, "jalgaon");
//		Student s4 = new Student(104, "Suraj", 85.60, 21, "Mumbai");
//		Student s5 = new Student(105, "Akash", 89.75, 20, "Akola");
		
		ArrayList<Student> stud = new ArrayList<Student>();
		
		stud.add(new Student(101, "Gaurav", 93.81, 19, "Pune"));
		stud.add(new Student(102, "Vinod", 88.45, 20, "Sambhaji Nagar"));
		stud.add(new Student(103, "Bhagyesh", 91.20, 19, "jalgaon"));
		stud.add(new Student(104, "Suraj", 85.60, 21, "Mumbai"));
		stud.add(new Student(105, "Akash", 89.75, 20, "Akola"));
		
//		for (int i = 0; i < stud.size(); i++) 
//		{
//			System.out.println(stud.get(i).getId());
//			System.out.println(stud.get(i).getName());
//			System.out.println(stud.get(i).getMarks());
//			System.out.println(stud.get(i).getAge());
//			System.out.println(stud.get(i).getAddress());
//			
//			System.out.println("--------------------------");
//		}
		
//		for (Student s : stud) 
//		{
//			System.out.println(s.getId());
//			System.out.println(s.getName());
//			System.out.println(s.getMarks());
//			System.out.println(s.getAge());
//			System.out.println(s.getAddress());
//			
//			System.out.println("--------------------------");
//		}
		
//		for (int i = 0; i < stud.size(); i++) 
//		{
//			stud.get(i).display();
//		}
		
		for (Student s : stud) 
		{
			s.display();
		}
		
	}
}