package com.gaurav.hashset;

import java.util.HashSet;

public class ForEachLoopIteration
{
    public static void main(String[] args)
    {
        HashSet<String> hs = new HashSet<String>();

        hs.add("Gaurav");
        hs.add("Vinod");
        hs.add("Bhagyesh");
        hs.add("Suraj");
        hs.add("Vikas");
        hs.add("Abhishek");
        hs.add("Vitthal");
        hs.add("Akash");
        hs.add("Praful");
        hs.add("Pavan");

        // for-each loop
        for (String s : hs)
        {
            System.out.println(s);
        }
    }
}