package com.gaurav.loopingstatement.dowhileloop;

import java.util.Scanner;

public class PositiveNegativeNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int num;

		do
		{
			System.out.print("Enter a positive number: ");
			num = sc.nextInt();
			
			if(num > 0)
			{
				System.out.println("You entered a valid positive number: " + num);
			}
			else
			{
				System.err.println("Invalid input! Please enter a positive number.");
			}
			
		} while(num <= 0);
	}
}