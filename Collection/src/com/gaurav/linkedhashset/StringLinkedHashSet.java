package com.gaurav.linkedhashset;

import java.util.LinkedHashSet;

public class StringLinkedHashSet
{
    public static void main(String[] args)
    {
        LinkedHashSet<String> lhs = new LinkedHashSet<>();

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

        System.out.println(lhs);
    }
}