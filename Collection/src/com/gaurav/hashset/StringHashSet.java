package com.gaurav.hashset;

import java.util.HashSet;

public class StringHashSet
{
    public static void main(String[] args)
    {
        HashSet<String> hs = new HashSet<>();

        hs.add("Gaurav");
        hs.add("Vinod");
        hs.add("Bhagyesh");
        hs.add("Suraj");
        hs.add("Vikas");

        System.out.println(hs);
    }
}