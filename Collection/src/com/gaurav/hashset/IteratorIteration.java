package com.gaurav.hashset;

import java.util.HashSet;
import java.util.Iterator;

public class IteratorIteration
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

        Iterator<String> itr = hs.iterator();

        while (itr.hasNext())   // check next element
        {
            System.out.println(itr.next()); // print element
        }
    }
}