package com.gaurav.filehandling;

import java.io.FileWriter;
import java.io.IOException;

public class Users
{
	int id;
	String username;
	String email;
	static String platformName = "CoreJavaApp";

	public static void main(String[] args)
	{
		FileWriter fw = null;

		try
		{
			fw = new FileWriter(
				"D:\\Eclipse IDE Projects\\Core_Java_Code_2026\\FileHandling\\Files\\User.txt"
			);

			// User 1
			Users u1 = new Users();
			u1.id = 1;
			u1.username = "gauravpatil";
			u1.email = "gaurav@gmail.com";

			// User 2
			Users u2 = new Users();
			u2.id = 2;
			u2.username = "vinodm";
			u2.email = "vinod@gmail.com";

			// User 3
			Users u3 = new Users();
			u3.id = 3;
			u3.username = "bhagyesh";
			u3.email = "bhagyesh@gmail.com";

			// User 4
			Users u4 = new Users();
			u4.id = 4;
			u4.username = "vikas";
			u4.email = "vikas@gmail.com";

			// User 5
			Users u5 = new Users();
			u5.id = 5;
			u5.username = "suraj";
			u5.email = "suraj@gmail.com";

			// Writing data to file
			writeUser(fw, u1);
			writeUser(fw, u2);
			writeUser(fw, u3);
			writeUser(fw, u4);
			writeUser(fw, u5);

			fw.flush();
			System.out.println("User data written successfully");
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

	static void writeUser(FileWriter fw, Users u) throws IOException
	{
		fw.write("\n-------------------------");
		fw.write("\nUser ID        : " + u.id);
		fw.write("\nUsername       : " + u.username);
		fw.write("\nEmail          : " + u.email);
		fw.write("\nPlatform Name  : " + platformName);
		fw.write("\n-------------------------\n");
	}
}