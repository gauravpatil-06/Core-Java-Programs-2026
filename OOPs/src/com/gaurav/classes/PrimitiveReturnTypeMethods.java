package com.gaurav.classes;

public class PrimitiveReturnTypeMethods 
{
	// Method returning byte
	byte getByte()
	{
		byte num1 = 10;
		return num1;
	}
	
	// Method returning short
	short getShort()
	{
		short num2 = 100;
		return num2;
	}
	
	// Method returning int
	int getInt()
	{
		int num3 = 1000;
		return num3;
	}
	
	// Method returning long
	long getLong()
	{
		long num4 = 100000L;
		return num4;
	}
	
	// Method returning float
	float getFloat()
	{
		float num5 = 10.10f;
		return num5;
	}
	
	// Method returning double
	double getDouble()
	{
		double num6 = 10.10000;
		return num6;
	}
	
	// Method returning char
		char getChar()
		{
			char ch = 'A';
			return ch;
		}
		
	// Method returning boolean
	boolean getBoolean()
	{
		boolean num7 = true;
		return num7;
	}
	
	public static void main(String[] args) 
	{
		PrimitiveReturnTypeMethods p1 = new PrimitiveReturnTypeMethods();
		
		byte no1 = p1.getByte();
		System.out.println("Returned Byte Value    : " + no1);
		
		short no2 = p1.getShort();
		System.out.println("Returned Short Value   : " + no2);
		
		int no3 = p1.getInt();
		System.out.println("Returned Int Value     : " + no3);
		
		long no4 = p1.getLong();
		System.out.println("Returned Long Value    : " + no4);
		
		float no5 = p1.getFloat();
		System.out.println("Returned Float Value   : " + no5);
		
		double no6 = p1.getDouble();
		System.out.println("Returned Double Value  : " + no6);
		
		char ch = p1.getChar();
		System.out.println("Returned Char Value    : " + ch);
		
		boolean no7 = p1.getBoolean();
		System.out.println("Returned Boolean Value : " + no7);
	}
}