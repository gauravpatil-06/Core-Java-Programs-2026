package com.gaurav.linkedhashset;

import java.util.LinkedHashSet;

public class ByteLinkedHashSet
{
    public static void main(String[] args)
    {
        LinkedHashSet<Byte> lhs = new LinkedHashSet<>();

        lhs.add((byte)1);
        lhs.add((byte)2);
        lhs.add((byte)3);
        lhs.add((byte)4);
        lhs.add((byte)5);
        lhs.add((byte)6);
        lhs.add((byte)7);
        lhs.add((byte)8);
        lhs.add((byte)9);
        lhs.add((byte)10);

        System.out.println(lhs);
    }
}