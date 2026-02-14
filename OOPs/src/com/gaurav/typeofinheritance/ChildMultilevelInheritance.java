package com.gaurav.typeofinheritance;

// Level 1 - Grand Parent
class GrandFather
{
	GrandFather()
	{
		System.out.println("GrandFather constructor called");
	}
}

// Level 2 - Parent
class Father extends GrandFather
{
	Father()
	{
		System.out.println("Father constructor called");
	}
}

// Level 3 - Child (Multilevel Inheritance)
public class ChildMultilevelInheritance extends Father
{
	ChildMultilevelInheritance()
	{
		System.out.println("Child constructor called");
	}

	public static void main(String[] args)
	{
		System.out.println("---- Object Creation Started ----");
		new ChildMultilevelInheritance();
		System.out.println("---- Object Creation Finished ----");
	}
}