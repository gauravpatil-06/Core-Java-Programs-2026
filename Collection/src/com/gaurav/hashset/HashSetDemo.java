package com.gaurav.hashset;

import java.util.HashSet;

public class HashSetDemo
{
    public static void main(String[] args)
    {
        // HashSet using Object type (heterogeneous data)
        HashSet<Object> hs = new HashSet<Object>();

        hs.add(10);                  // Integer
        hs.add(true);                // Boolean
        hs.add(10.10f);              // Float
        hs.add(100);                 // Integer
        hs.add(10000000000000000L);  // Long
        hs.add(100.000);             // Double
        hs.add("Gaurav");            // String
        hs.add(false);               // Boolean
        hs.add('A');                 // Character

        // Display elements
        System.out.println(hs);
    }
}