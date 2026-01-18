package com.gaurav.loopingstatement.dowhileloop;

public class StarPattern 
{
	public static void main(String[] args)
	{
		System.out.println("Square Star Pattern\n");
		
		// Square Star Pattern
		int i = 1;
		do
		{
			int j = 1;
			do
			{
				System.out.print("* ");
				j++;
			} while(j <= 5);
			
			System.out.println();
			i++;
		} while(i <= 5);
		
		
		System.out.println("\nPattern with Different Middle Row\n");
		
		// Pattern with Different Middle Row
		i = 1;
		do
		{
			int j = 1;
			do
			{
				if(i == 3)
				{
					System.out.print(" # ");
				}
				else
				{
					System.out.print(" * ");
				}
				j++;
			} while(j <= 5);
			
			System.out.println();
			i++;
		} while(i <= 5);
		
		
		System.out.println("\nMixed Symbol Square Pattern\n");
		
		// Mixed Symbol Square Pattern
		i = 1;
		do
		{
			int j = 1;
			do
			{
				if(j == 2)
				{
					System.out.print(" % ");
				}
				else if(j == 4)
				{
					System.out.print(" ! ");
				}
				else if(i == 3)
				{
					System.out.print(" # ");
				}
				else if(i == 2)
				{
					System.out.print(" $ ");
				}
				else if(i == 4)
				{
					System.out.print(" @ ");
				}
				else
				{
					System.out.print(" * ");
				}
				j++;
			} while(j <= 5);
			
			System.out.println();
			i++;
		} while(i <= 5);
	}
}