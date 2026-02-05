package com.gaurav.stack;

import java.util.Stack;

public class IntegerStack
{
    public static void main(String[] args)
    {
        Stack<Integer> s = new Stack<Integer>();

        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        s.push(60);
        s.push(70);
        s.push(80);
        s.push(90);
        s.push(100);

        System.out.println(s);
    }
}