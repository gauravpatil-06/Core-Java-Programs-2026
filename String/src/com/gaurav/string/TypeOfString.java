package com.gaurav.string;

public class TypeOfString
{
	public static void main(String[] args)
	{
		// 1. String Literal
		// Immutable (cannot be changed)
		// Stored in String Constant Pool (SCP)
		String name = "Gaurav Patil";
		System.out.println("String Literal       : " + name);

		// 2. String Object (using new keyword)
		// Immutable
		// Stored in Heap memory
		String str = new String("Gaurav Patil");
		System.out.println("String Object        : " + str);

		// 3. StringBuffer
		// Mutable (can be changed)
		// Thread-safe (synchronized)
		StringBuffer buffer = new StringBuffer("Gaurav Patil");
		System.out.println("StringBuffer Object  : " + buffer);

		// 4. StringBuilder
		// Mutable
		// Not thread-safe (faster than StringBuffer)
		StringBuilder builder = new StringBuilder("Gaurav Patil");
		System.out.println("StringBuilder Object : " + builder);
	}
}