package com.gaurav.conditionalstatement.ifstatement;

import java.util.Scanner;

public class NegativeNumber 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter any number: ");
		int num=sc.nextInt();
		
		if(num < 0)
		{
			System.out.println("Number is Negative");
		}
	}
}