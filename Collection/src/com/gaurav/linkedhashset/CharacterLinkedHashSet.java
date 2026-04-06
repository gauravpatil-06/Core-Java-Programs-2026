package com.gaurav.linkedhashset;

import java.util.LinkedHashSet;

public class CharacterLinkedHashSet
{
    public static void main(String[] args)
    {
        LinkedHashSet<Character> lhs = new LinkedHashSet<>();

        lhs.add('A');
        lhs.add('B');
        lhs.add('C');
        lhs.add('D');
        lhs.add('E');
        lhs.add('F');
        lhs.add('G');
        lhs.add('H');
        lhs.add('I');
        lhs.add('J');

        System.out.println(lhs);
    }
}