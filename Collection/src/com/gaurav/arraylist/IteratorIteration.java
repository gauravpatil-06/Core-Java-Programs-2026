package com.gaurav.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorIteration 
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
		
		Iterator<String> itr = al.iterator();
		
		while (itr.hasNext()) // check next element
		{
			System.out.println(itr.next()); // print element
		}
	}
}
