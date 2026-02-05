package com.gaurav.stack;

import java.util.Stack;

public class LongStack
{
    public static void main(String[] args)
    {
        Stack<Long> s = new Stack<Long>();

        s.push(1000000000000000L);
        s.push(2000000000000000L);
        s.push(3000000000000000L);
        s.push(4000000000000000L);
        s.push(5000000000000000L);
        s.push(6000000000000000L);
        s.push(7000000000000000L);
        s.push(8000000000000000L);
        s.push(9000000000000000L);
        s.push(10000000000000000L);

        System.out.println(s);
    }
}