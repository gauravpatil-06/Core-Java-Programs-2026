package com.gaurav.arrays;

import java.util.Scanner;

public class ThreeDimensionalArray
{
	public static void main(String[] args)
	{
		// MANUAL WAY
		int[][] manual = {
			{10, 20, 30},
			{40, 50, 60},
			{70, 80, 90}
		};

		System.out.println("Three Dimensional Array:");
		for(int i = 0; i < 3; i++)
		{
			for(int j = 0; j < 3; j++)
			{
				System.out.print(manual[i][j] + " ");
			}
			System.out.println();
		}

		// USER INPUT WA
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[3][3];

		System.out.println("\nEnter 9 values for 3x3 array:");

		for(int i = 0; i < 3; i++)
		{
			for(int j = 0; j < 3; j++)
			{
				System.out.print("Enter value at position [" + i + "][" + j + "]: ");
				arr[i][j] = sc.nextInt();
			}
		}

		System.out.println("\nArray Values:");
		for(int i = 0; i < 3; i++)
		{
			for(int j = 0; j < 3; j++)
			{
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}