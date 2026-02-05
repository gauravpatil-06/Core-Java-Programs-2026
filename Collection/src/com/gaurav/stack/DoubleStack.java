package com.gaurav.stack;

import java.util.Stack;

public class DoubleStack
{
    public static void main(String[] args)
    {
        Stack<Double> s = new Stack<Double>();

        s.push(100.50);
        s.push(200.50);
        s.push(300.50);
        s.push(400.50);
        s.push(500.50);
        s.push(600.50);
        s.push(700.50);
        s.push(800.50);
        s.push(900.50);
        s.push(1000.50);

        System.out.println(s);
    }
}