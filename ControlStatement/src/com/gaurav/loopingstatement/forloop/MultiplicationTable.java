package com.gaurav.loopingstatement.forloop;

import java.util.Scanner;

public class MultiplicationTable 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number to print multiplication table: ");
		int num = sc.nextInt();
		
		if(num > 0)
		{
			System.out.println("\nMultiplication Table of " + num + ":");
			
			for(int i = 1; i <= 10; i++)
			{
				System.out.println(num + " * " + i + " = " + (num * i));
			}
		}
		else
		{
			System.out.println("Please enter a positive number");
		}
	}
}