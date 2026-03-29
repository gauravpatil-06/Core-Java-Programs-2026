package com.gaurav.stack;

import java.util.Stack;

public class ShortStack
{
    public static void main(String[] args)
    {
        Stack<Short> s = new Stack<Short>();

        s.push((short)1);
        s.push((short)2);
        s.push((short)3);
        s.push((short)4);
        s.push((short)5);
        s.push((short)6);
        s.push((short)7);
        s.push((short)8);
        s.push((short)9);
        s.push((short)10);

        System.out.println(s);
    }
}