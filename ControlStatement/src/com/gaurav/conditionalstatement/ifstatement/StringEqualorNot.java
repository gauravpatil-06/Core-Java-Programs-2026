package com.gaurav.conditionalstatement.ifstatement;

import java.util.Scanner;

public class StringEqualorNot 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter First String: ");
		String s1=sc.nextLine();
		
		System.out.print("Enter Second String: ");
		String s2=sc.nextLine();
		
		if(s1.equals(s2))
		{
			System.out.println("Both String are Equal");
		}
		
		if(!s1.equals(s2))
		{
			System.out.println("Both String are not Equal");
		}
	}
}
