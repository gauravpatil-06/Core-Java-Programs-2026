package com.gaurav.linkedlist;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorIteration 
{
	public static void main(String[] args) 
	{
		LinkedList<String> ll = new LinkedList<String>();
		
		ll.add("Gaurav");
		ll.add("Vinod");
		ll.add("Bhagyesh");
		ll.add("Suraj");
		ll.add("Vikas");
		ll.add("Abhishek");
		ll.add("Vitthal");
		ll.add("Akash");
		ll.add("Praful");
		ll.add("Pavan");
		
		ListIterator<String> ltr = ll.listIterator();
		
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