package com.gaurav.vector;

import java.util.Vector;

public class VectorDemo
{
    public static void main(String[] args)
    {
        // Vector using Object type (heterogeneous data)
        Vector<Object> list = new Vector<Object>();

        list.add(10);                  // Integer
        list.add(true);                // Boolean
        list.add(10.10f);              // Float
        list.add(100);                 // Integer
        list.add(10000000000000000L);  // Long
        list.add(100.000);             // Double
        list.add("Gaurav");            // String
        list.add(false);               // Boolean
        list.add('A');                 // Character

        // Display elements
        System.out.println(list);
    }
}