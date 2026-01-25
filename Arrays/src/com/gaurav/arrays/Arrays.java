package com.gaurav.arrays;

public class Arrays
{
	public static void main(String[] args)
	{
		int[] marks; // Integer array declaration
		marks = new int[5]; // memory allocation

		// If int values are not assigned default value is 0 (For String, default value is null)
		marks[0] = 10;
		marks[1] = 20;
		marks[2] = 30;
		marks[3] = 40;
		marks[4] = 50;
		
//		int marks[] = {10,20,30,40,50};
		
		System.out.println("Marks Array Values:");
		System.out.println("marks[0] = " + marks[0]);
		System.out.println("marks[1] = " + marks[1]);
		System.out.println("marks[2] = " + marks[2]);
		System.out.println("marks[3] = " + marks[3]);
		System.out.println("marks[4] = " + marks[4]);
		
		System.out.println("\n-------------------\n");
		
		// String array declaration and initialization
		String[] name = new String[5];
		
		name[0] = "Gaurav";
		name[1] = "Vinod";
		name[2] = "Bhagyesh";
		name[3] = "Vikas";
		name[4] = "Suraj";
		
//		String name[] = {"Gaurav","Vinod","Bhagyesh","Vikas","Suraj"};
		
		System.out.println("Names Array Values:");
		System.out.println("name[0] = " + name[0]);
		System.out.println("name[1] = " + name[1]);
		System.out.println("name[2] = " + name[2]);
		System.out.println("name[3] = " + name[3]);
		System.out.println("name[4] = " + name[4]);
		
		// System.out.println(name); // Prints array reference (address)
	}
}