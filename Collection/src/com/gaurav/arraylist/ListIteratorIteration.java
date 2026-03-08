package com.gaurav.arraylist;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorIteration 
{
	public static void main(String[] args) 
	{
		ArrayList<String> al = new ArrayList<String>();
		
		al.add("Gaurav");
		al.add("Vinod");
		al.add("Bhagyesh");
		al.add("Suraj");
		al.add("Vikas");
		al.add("Abhishek");
		al.add("Vitthal");
		al.add("Akash");
		al.add("Praful");
		al.add("Pavan");
		
		ListIterator<String> ltr = al.listIterator();
		
		System.out.println("Forward Direction\n");
		
		while (ltr.hasNext())   // check next element
		{
			System.out.println(ltr.next()); // print element
		}
		
		System.out.println("\nBackward Direction\n");
		
		while (ltr.hasPrevious()) // check previous element
		{
			System.out.println(ltr.previous()); // print element
		}
	}
}