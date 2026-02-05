package com.gaurav.hashset;

import java.util.HashSet;

public class LongHashSet
{
    public static void main(String[] args)
    {
        HashSet<Long> hs = new HashSet<>();

        hs.add(1000000000000000L);
        hs.add(2000000000000000L);
        hs.add(3000000000000000L);
        hs.add(4000000000000000L);
        hs.add(5000000000000000L);

        System.out.println(hs);
    }
}
