package com.gaurav.linkedhashset;

import java.util.LinkedHashSet;

public class LongLinkedHashSet
{
    public static void main(String[] args)
    {
        LinkedHashSet<Long> lhs = new LinkedHashSet<>();

        lhs.add(1000000000000000L);
        lhs.add(2000000000000000L);
        lhs.add(3000000000000000L);
        lhs.add(4000000000000000L);
        lhs.add(5000000000000000L);
        lhs.add(6000000000000000L);
        lhs.add(7000000000000000L);
        lhs.add(8000000000000000L);
        lhs.add(9000000000000000L);
        lhs.add(10000000000000000L);

        System.out.println(lhs);
    }
}