package com.gaurav.loopingstatement.forloop;

public class MultipleVariables 
{
	public static void main(String[] args)
	{
		System.out.println("TrickyProgram - 1\n");
		
		for(int i=1,j=1;i<=10;i++,j++)
		{
			System.out.println(i);
		}
		
		System.out.println("\nTrickyProgram - 2\n");
		
		for(int i=1,j=1;i<=10;i++)
		{
			System.out.println(j);
		}
		
		System.out.println("\nTrickyProgram - 3\n");
		
		//Square
		for(int i=1,j=1;i<=10;i++,j++)
		{
			System.out.println(i * j);
		}
		
		System.out.println("\nTrickyProgram - 3\n");
		
		//Cube
		for(int i=1,j=1,k=1;i<=10;i++,j++,k++)
		{
			System.out.println(i * j * k);
		}
	}
}