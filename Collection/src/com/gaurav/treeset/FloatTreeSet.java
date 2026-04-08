package com.gaurav.treeset;

import java.util.TreeSet;

public class FloatTreeSet
{
    public static void main(String[] args)
    {
        TreeSet<Float> ts = new TreeSet<Float>();

        ts.add(10.5f);
        ts.add(20.5f);
        ts.add(30.5f);
        ts.add(40.5f);
        ts.add(50.5f);
        ts.add(60.5f);
        ts.add(70.5f);
        ts.add(80.5f);
        ts.add(90.5f);
        ts.add(100.5f);

        System.out.println(ts);
    }
}