package com.gaurav.hashset;

import java.util.HashSet;

public class ShortHashSet
{
    public static void main(String[] args)
    {
        HashSet<Short> hs = new HashSet<>();

        hs.add((short)1);
        hs.add((short)2);
        hs.add((short)3);
        hs.add((short)4);
        hs.add((short)5);
        hs.add((short)6);
        hs.add((short)7);
        hs.add((short)8);
        hs.add((short)9);
        hs.add((short)10);

        System.out.println(hs);
    }
}