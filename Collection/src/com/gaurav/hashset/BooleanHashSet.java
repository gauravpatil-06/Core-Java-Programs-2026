package com.gaurav.hashset;

import java.util.HashSet;

public class BooleanHashSet
{
    public static void main(String[] args)
    {
        HashSet<Boolean> hs = new HashSet<>();

        hs.add(true);
        hs.add(false);

        System.out.println(hs);
    }
}