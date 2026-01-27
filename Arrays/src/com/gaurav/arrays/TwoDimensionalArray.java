package com.gaurav.arrays;

import java.util.Scanner;

public class TwoDimensionalArray
{
	public static void main(String[] args)
	{
		// MANUAL WAY 
		int number[][] = new int[2][2];

		number[0][0] = 10;
		number[0][1] = 20;
		number[1][0] = 30;
		number[1][1] = 40;

		System.out.println("Two Dimensional Array:");
		for(int i = 0; i < 2; i++)
		{
			for(int j = 0; j < 2; j++)
			{
				System.out.print(number[i][j] + " ");
			}
			System.out.println();
		}

		// USER INPUT WAY
		Scanner sc = new Scanner(System.in);

		System.out.println("\nEnter values for 2x2 array:");
		int arr[][] = new int[2][2];

		for(int i = 0; i < 2; i++)
		{
			for(int j = 0; j < 2; j++)
			{
				System.out.print("Enter value at position [" + i + "][" + j + "]: ");
				arr[i][j] = sc.nextInt();
			}
		}

		System.out.println("\nTwo Dimensional Array:");
		for(int i = 0; i < 2; i++)
		{
			for(int j = 0; j < 2; j++)
			{
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
	}
}