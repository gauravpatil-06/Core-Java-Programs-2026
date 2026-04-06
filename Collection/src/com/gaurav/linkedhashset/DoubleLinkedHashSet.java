package com.gaurav.linkedhashset;

import java.util.LinkedHashSet;

public class DoubleLinkedHashSet
{
    public static void main(String[] args)
    {
        LinkedHashSet<Double> lhs = new LinkedHashSet<>();

        lhs.add(100.50);
        lhs.add(200.50);
        lhs.add(300.50);
        lhs.add(400.50);
        lhs.add(500.50);
        lhs.add(600.50);
        lhs.add(700.50);
        lhs.add(800.50);
        lhs.add(900.50);
        lhs.add(1000.50);

        System.out.println(lhs);
    }
}