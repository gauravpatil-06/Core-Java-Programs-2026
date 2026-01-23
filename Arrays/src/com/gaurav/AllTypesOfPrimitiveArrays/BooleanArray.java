package com.gaurav.alltypesofprimitivearrays;

public class BooleanArray 
{
	public static void main(String[] args) 
	{
		boolean[] arr = {true, false, true, false, false, true, true, false, true};

		System.out.println("Boolean Array Elements:");

		for(boolean i : arr) 
		{
			System.out.print(i + "\t");
		}
	}
}