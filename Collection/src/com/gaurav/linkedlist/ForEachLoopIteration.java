package com.gaurav.linkedlist;

import java.util.LinkedList;

public class ForEachLoopIteration 
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
		
		for (String s : ll) 
		{
			System.out.println(s);
		}
	}
}
