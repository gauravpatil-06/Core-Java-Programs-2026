package com.gaurav.filehandling;

import java.io.*;
import java.util.Scanner;

public class CRUDAPP
{
	void createFile()
	{
		File f1 = new File(
			"D:\\Eclipse IDE Projects\\Core_Java_Code_2026\\FileHandling\\Files\\CRUDApp.txt"
		);

		try
		{
			if(f1.createNewFile())
			{
				System.out.println("File Created Successfully");
			}
			else
			{
				System.out.println("File already exists");
			}
		}
		catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
	}

	void writeFile()
	{
		try
		{
			FileWriter fw = new FileWriter(
				"D:\\Eclipse IDE Projects\\Core_Java_Code_2026\\FileHandling\\Files\\CRUDApp.txt"
			);

			Students s1 = new Students();
			s1.setId(101);
			s1.setName("Gaurav");
			s1.setAddress("Pune");
			s1.setAge(19);
			s1.setCollegeName("DYPCOE");

			Students s2 = new Students();
			s2.setId(102);
			s2.setName("Vinod");
			s2.setAddress("Pune");
			s2.setAge(20);
			s2.setCollegeName("PVG");

			Students s3 = new Students();
			s3.setId(103);
			s3.setName("Bhagyesh");
			s3.setAddress("Pune");
			s3.setAge(18);
			s3.setCollegeName("DYPCOE");

			Students[] stud = new Students[3];
			stud[0] = s1;
			stud[1] = s2;
			stud[2] = s3;

			for(Students s : stud)
			{
				fw.write("\n------------------------");
				fw.write("\nStudent ID      : " + s.getId());
				fw.write("\nStudent Name    : " + s.getName());
				fw.write("\nStudent Address : " + s.getAddress());
				fw.write("\nStudent Age     : " + s.getAge());
				fw.write("\nCollege Name    : " + s.getCollegeName());
				fw.write("\n------------------------");
			}

			fw.flush();
			fw.close();

			System.out.println("File Written Successfully");
		}
		catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
	}

	void readFile()
	{
		try
		{
			FileReader fr = new FileReader(
				"D:\\Eclipse IDE Projects\\Core_Java_Code_2026\\FileHandling\\Files\\CRUDApp.txt"
			);

			int data;

			while((data = fr.read()) != -1)
			{
				System.out.print((char)data);
			}

			fr.close();
			System.out.println("\n\nFile Read Successfully");
		}
		catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
	}

	void deleteFile()
	{
		File f1 = new File(
			"D:\\Eclipse IDE Projects\\Core_Java_Code_2026\\FileHandling\\Files\\CRUDApp.txt"
		);

		if(f1.exists())
		{
			f1.delete();
			System.out.println("File Deleted Successfully");
		}
		else
		{
			System.out.println("File Not Found");
		}
	}

	public static void main(String[] args)
	{
		CRUDAPP c1 = new CRUDAPP();
		
		Scanner sc = new Scanner(System.in);
		
		int choice;

		while(true)
		{
			System.out.println("\n----- CRUD APP -----");
			System.out.println("1. Create File");
			System.out.println("2. Write File");
			System.out.println("3. Read File");
			System.out.println("4. Delete File");
			System.out.println("5. Exit");
			System.out.print("Enter your choice: ");

			choice = sc.nextInt();

			switch(choice)
			{
				case 1:
					c1.createFile();
					break;

				case 2:
					c1.writeFile();
					break;

				case 3:
					c1.readFile();
					break;

				case 4:
					c1.deleteFile();
					break;

				case 5:
					System.out.println("Thanks for using this software");
					sc.close();
					return;

				default:
					System.out.println("Invalid choice");
			}
		}
	}
}