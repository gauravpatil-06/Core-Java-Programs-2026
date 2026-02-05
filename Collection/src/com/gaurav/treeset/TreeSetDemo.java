package com.gaurav.treeset;

import java.util.TreeSet;

public class TreeSetDemo
{
    public static void main(String[] args)
    {
        // TreeSet using homogeneous data (String)
        TreeSet<String> ts = new TreeSet<String>();

        ts.add("10");
        ts.add("true");
        ts.add("10.10");
        ts.add("100");
        ts.add("10000000000000000");
        ts.add("100.000");
        ts.add("Gaurav");
        ts.add("false");
        ts.add("A");

        // Display elements (sorted in natural order)
        System.out.println(ts);
    }
}