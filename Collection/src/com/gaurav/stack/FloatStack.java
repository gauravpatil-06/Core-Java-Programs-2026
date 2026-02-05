package com.gaurav.stack;

import java.util.Stack;

public class FloatStack
{
    public static void main(String[] args)
    {
        Stack<Float> s = new Stack<Float>();

        s.push(10.5f);
        s.push(20.5f);
        s.push(30.5f);
        s.push(40.5f);
        s.push(50.5f);
        s.push(60.5f);
        s.push(70.5f);
        s.push(80.5f);
        s.push(90.5f);
        s.push(100.5f);

        System.out.println(s);
    }
}