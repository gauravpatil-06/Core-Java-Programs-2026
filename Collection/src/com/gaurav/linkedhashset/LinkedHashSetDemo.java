package com.gaurav.linkedhashset;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo
{
    public static void main(String[] args)
    {
        // LinkedHashSet using Object type (heterogeneous data)
        LinkedHashSet<Object> lhs = new LinkedHashSet<Object>();

        lhs.add(10);                  // Integer
        lhs.add(true);                // Boolean
        lhs.add(10.10f);              // Float
        lhs.add(100);                 // Integer
        lhs.add(10000000000000000L);  // Long
        lhs.add(100.000);             // Double
        lhs.add("Gaurav");            // String
        lhs.add(false);               // Boolean
        lhs.add('A');                 // Character
        lhs.add("Gaurav");            // Duplicate (ignored)

        // Display elements
        System.out.println(lhs);
    }
}