package com.gaurav.conditionalstatement.ifstatement;

import java.util.Scanner;

public class GreaterThan 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter any number: ");
		int num=sc.nextInt();
		
		if(num > 10)
		{
			System.out.println("Number is Greater than 10");
		}
	}
}
