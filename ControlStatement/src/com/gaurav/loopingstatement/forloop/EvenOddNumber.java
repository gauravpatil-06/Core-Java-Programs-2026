package com.gaurav.loopingstatement.forloop;

public class EvenOddNumber 
{
	public static void main(String[] args)
	{
		System.out.println("Even Number\n");
		
		for(int i=1; i<=10; i++)
		{
			if(i % 2 == 0)
			{
				System.out.println(i);
			}
		}
		
		System.out.println("\nOdd Number\n");
		
		for(int i=1; i<=10; i++)
		{
			if(i % 2 == 1)
			{
				System.out.println(i);
			}
		}
	}
}