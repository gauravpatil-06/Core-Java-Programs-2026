package com.gaurav.arraylist;

import java.util.ArrayList;

public class InstanceOfOpeartor 
{
	public static void main(String[] args) 
	{
		ArrayList<String> al = new ArrayList<String>();
		
		al.add("Gaurav");

		// Checking String object
		System.out.println("Gaurav" instanceof String);   // true
		
		// Checking ArrayList object
		System.out.println(al instanceof ArrayList);      // true
		
		// Checking Object class (parent of all classes)
		System.out.println(al instanceof Object);         // true
	}
}