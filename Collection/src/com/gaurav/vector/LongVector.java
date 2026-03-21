package com.gaurav.vector;

import java.util.Vector;

public class LongVector
{
    public static void main(String[] args)
    {
        Vector<Long> v = new Vector<Long>();

        v.add(1000000000000000L);
        v.add(2000000000000000L);
        v.add(3000000000000000L);
        v.add(4000000000000000L);
        v.add(5000000000000000L);
        v.add(6000000000000000L);
        v.add(7000000000000000L);
        v.add(8000000000000000L);
        v.add(9000000000000000L);
        v.add(10000000000000000L);

        System.out.println(v);
    }
}