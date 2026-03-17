package com.gaurav.linkedlist;

import java.util.LinkedList;
import java.util.Iterator;

public class IteratorIteration 
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
		
		Iterator<String> itr = ll.iterator();
		
		while (itr.hasNext()) // check next element
		{
			System.out.println(itr.next()); // print element
		}
	}
}
