package com.gaurav.linkedhashset;

import java.util.LinkedHashSet;

public class IntegerLinkedHashSet
{
    public static void main(String[] args)
    {
        LinkedHashSet<Integer> lhs = new LinkedHashSet<Integer>();

        lhs.add(10);
        lhs.add(20);
        lhs.add(30);
        lhs.add(40);
        lhs.add(50);
        lhs.add(60);
        lhs.add(70);
        lhs.add(80);
        lhs.add(90);
        lhs.add(100);

        System.out.println(lhs);
    }
}