package com.gaurav.linkedhashset;

import java.util.LinkedHashSet;

public class FloatLinkedHashSet
{
    public static void main(String[] args)
    {
        LinkedHashSet<Float> lhs = new LinkedHashSet<>();

        lhs.add(10.5f);
        lhs.add(20.5f);
        lhs.add(30.5f);
        lhs.add(40.5f);
        lhs.add(50.5f);
        lhs.add(60.5f);
        lhs.add(70.5f);
        lhs.add(80.5f);
        lhs.add(90.5f);
        lhs.add(100.5f);

        System.out.println(lhs);
    }
}