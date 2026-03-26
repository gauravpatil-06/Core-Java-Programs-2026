package com.gaurav.stack;

import java.util.Stack;

public class StackDemo
{
    public static void main(String[] args)
    {
        // Stack using Object type (heterogeneous data)
        Stack<Object> stack = new Stack<Object>();

        stack.push(10);                  // Integer
        stack.push(true);                // Boolean
        stack.push(10.10f);              // Float
        stack.push(100);                 // Integer
        stack.push(10000000000000000L);  // Long
        stack.push(100.000);             // Double
        stack.push("Gaurav");             // String
        stack.push(false);               // Boolean
        stack.push('A');                 // Character

        // Display elements
        System.out.println(stack);
    }
}