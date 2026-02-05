package com.gaurav.linkedhashset;

import java.util.LinkedHashSet;

public class ForEachLoopIteration
{
    public static void main(String[] args)
    {
        LinkedHashSet<String> lhs = new LinkedHashSet<String>();

        lhs.add("Gaurav");
        lhs.add("Vinod");
        lhs.add("Bhagyesh");
        lhs.add("Suraj");
        lhs.add("Vikas");
        lhs.add("Abhishek");
        lhs.add("Vitthal");
        lhs.add("Akash");
        lhs.add("Praful");
        lhs.add("Pavan");

        // for-each loop
        for (String s : lhs)
        {
            System.out.println(s);
        }
    }
}