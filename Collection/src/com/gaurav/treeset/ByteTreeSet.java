package com.gaurav.treeset;

import java.util.TreeSet;

public class ByteTreeSet
{
    public static void main(String[] args)
    {
        TreeSet<Byte> ts = new TreeSet<Byte>();

        ts.add((byte)1);
        ts.add((byte)2);
        ts.add((byte)3);
        ts.add((byte)4);
        ts.add((byte)5);
        ts.add((byte)6);
        ts.add((byte)7);
        ts.add((byte)8);
        ts.add((byte)9);
        ts.add((byte)10);

        System.out.println(ts);
    }
}