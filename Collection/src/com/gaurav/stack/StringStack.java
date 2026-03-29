package com.gaurav.stack;

import java.util.Stack;

public class StringStack
{
    public static void main(String[] args)
    {
        Stack<String> s = new Stack<String>();

        s.push("Gaurav");
        s.push("Vinod");
        s.push("Bhagyesh");
        s.push("Suraj");
        s.push("Vikas");
        s.push("Abhishek");
        s.push("Vitthal");
        s.push("Akash");
        s.push("Praful");
        s.push("Pavan");

        System.out.println(s);
    }
}