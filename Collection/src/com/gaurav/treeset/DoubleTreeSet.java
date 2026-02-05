package com.gaurav.treeset;

import java.util.TreeSet;

public class DoubleTreeSet
{
    public static void main(String[] args)
    {
        TreeSet<Double> ts = new TreeSet<Double>();

        ts.add(100.50);
        ts.add(200.50);
        ts.add(300.50);
        ts.add(400.50);
        ts.add(500.50);
        ts.add(600.50);
        ts.add(700.50);
        ts.add(800.50);
        ts.add(900.50);
        ts.add(1000.50);

        System.out.println(ts);
    }
}