package com.gaurav.linkedhashset;

import java.util.LinkedHashSet;
import java.util.Iterator;

public class IteratorIteration
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

        Iterator<String> itr = lhs.iterator();

        while (itr.hasNext())   // check next element
        {
            System.out.println(itr.next()); // print element
        }
    }
}