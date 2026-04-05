package com.gaurav.linkedhashset;

import java.util.LinkedHashSet;

public class BooleanLinkedHashSet
{
    public static void main(String[] args)
    {
        LinkedHashSet<Boolean> lhs = new LinkedHashSet<>();

        lhs.add(true);
        lhs.add(false);

        System.out.println(lhs);
    }
}