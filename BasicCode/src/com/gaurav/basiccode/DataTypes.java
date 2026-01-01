package com.gaurav.basiccode;

public class DataTypes {

    public static void main(String[] args) {

        byte b = 10;        
        // byte: 1 byte | Range: -128 to 127
        System.out.println("byte value = " + b);

        short s = 100;      
        // short: 2 bytes | Range: -32,768 to 32,767
        System.out.println("short value = " + s);

        int i = 1000;       
        // int: 4 bytes | Range: -2^31 to 2^31-1
        System.out.println("int value = " + i);

        long l = 10000L;    
        // long: 8 bytes | Range: -2^63 to 2^63-1
        System.out.println("long value = " + l);

        float f = 10.5f;    
        // float: 4 bytes | Range: approx ±3.4E38 (6–7 digits)
        System.out.println("float value = " + f);

        double d = 20.75;   
        // double: 8 bytes | Range: approx ±1.7E308 (15 digits)
        System.out.println("double value = " + d);

        char c = 'A';       
        // char: 2 bytes | Range: 0 to 65,535 (Unicode)
        System.out.println("char value = " + c);

        boolean flag = true; 
        // boolean: 1 bit | Values: true / false
        System.out.println("boolean value = " + flag);
    }
}