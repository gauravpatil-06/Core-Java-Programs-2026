package com.gaurav.linkedhashset;

import java.util.LinkedHashSet;

public class ShortLinkedHashSet
{
    public static void main(String[] args)
    {
        LinkedHashSet<Short> lhs = new LinkedHashSet<>();

        lhs.add((short)1);
        lhs.add((short)2);
        lhs.add((short)3);
        lhs.add((short)4);
        lhs.add((short)5);
        lhs.add((short)6);
        lhs.add((short)7);
        lhs.add((short)8);
        lhs.add((short)9);
        lhs.add((short)10);

        System.out.println(lhs);
    }
}