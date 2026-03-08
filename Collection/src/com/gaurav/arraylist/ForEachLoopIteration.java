package com.gaurav.arraylist;

import java.util.ArrayList;

public class ForEachLoopIteration 
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
		
		for (String s : al) 
		{
			System.out.println(s);
		}
	}
}
