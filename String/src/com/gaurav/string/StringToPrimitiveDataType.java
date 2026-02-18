package com.gaurav.string;

public class StringToPrimitiveDataType 
{
	public static void main(String[] args) 
	{
		// String input
		String str = "100";

		// String to int
		int i = Integer.parseInt(str);
		System.out.println("int value     : " + i);

		// String to short
		short s = Short.parseShort(str);
		System.out.println("short value   : " + s);

		// String to byte
		byte b = Byte.parseByte(str);
		System.out.println("byte value    : " + b);

		// String to long
		long l = Long.parseLong(str);
		System.out.println("long value    : " + l);

		// String to float
		float f = Float.parseFloat(str);
		System.out.println("float value   : " + f);

		// String to double
		double d = Double.parseDouble(str);
		System.out.println("double value  : " + d);

		// String to boolean
		boolean bool = Boolean.parseBoolean(str);
		System.out.println("boolean value : " + bool);
	}
}