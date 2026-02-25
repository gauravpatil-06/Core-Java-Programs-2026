package com.gaurav.filehandling;

import java.io.FileWriter;
import java.io.IOException;

public class RandomNumber
{
	public static void main(String[] args)
	{
		FileWriter fw = null;

		try
		{
			fw = new FileWriter(
				"D:\\Eclipse IDE Projects\\Core_Java_Code_2026\\FileHandling\\Files\\RandomNumber.txt"
			);

			// Generate and store 100 random numbers
			for(int i = 1; i <= 100; i++)
			{
				int num = (int)(Math.random() * 100); // 0 to 99
				fw.write("Random Number " + i + " : " + num + "\n");
			}

			fw.flush();
			System.out.println("100 Random Numbers written successfully");
		}
		catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
		finally
		{
			try
			{
				fw.close();
			}
			catch(IOException e)
			{
				System.out.println(e.getMessage());
			}
		}
	}
}