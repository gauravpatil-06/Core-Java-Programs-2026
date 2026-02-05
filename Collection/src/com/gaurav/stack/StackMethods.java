package com.gaurav.stack;

import java.util.Stack;

public class StackMethods
{
    public static void main(String[] args)
    {
        // Create Stack objects
        Stack<String> s = new Stack<String>();   // Main Stack
        Stack<String> s2 = new Stack<String>();  // Second Stack

        // add() → Adds elements to the Stack
        s.add("Gaurav");
        s.add("Vinod");
        s.add("Bhagyesh");
        s.add("Suraj");
        s.add("Vikas");
        s.add("Abhishek");
        s.add("Vitthal");
        s.add("Akash");
        s.add("Praful");
        s.add("Gaurav"); // Duplicate allowed

        // push() → Adds elements to second Stack
        s2.push("Gaurav");
        s2.push("Vinod");
        s2.push("Bhagyesh");
        s2.push("Suraj");
        s2.push("Vikas");

        // get(index)
        System.out.println("get(): " + s.get(0));

        // size()
        System.out.println("size(): " + s.size());

        // contains()
        System.out.println("contains(): " + s.contains("Gaurav"));

        // indexOf()
        System.out.println("indexOf(): " + s.indexOf("Gaurav"));

        // lastIndexOf()
        System.out.println("lastIndexOf(): " + s.lastIndexOf("Gaurav"));

        // peek() → Returns top element without removing
        System.out.println("peek(): " + s.peek());
        System.out.println("After peek(): " + s);

        // pop() → Removes and returns top element
        System.out.println("pop(): " + s.pop());
        System.out.println("After pop(): " + s);

        // remove(index)
        System.out.println("remove(index): " + s.remove(0));
        System.out.println(s);

        // set(index, element)
        System.out.println("set(): " + s.set(0, "Gaurav Patil"));
        System.out.println(s);

        // addAll()
        s.addAll(s2);
        System.out.println("addAll(): " + s);

        // removeAll()
        s.removeAll(s2);
        System.out.println("removeAll(): " + s);

        // add(index, element)
        s.add(1, "Rahul");
        System.out.println("add(index): " + s);

        // remove(object)
        s.remove("Rahul");
        System.out.println("remove(object): " + s);

        // equals()
        System.out.println("equals(): " + s.equals(s2));

        // toArray()
        Object[] arr = s.toArray();
        System.out.println("toArray length: " + arr.length);

        // retainAll()
        s.retainAll(s2);
        System.out.println("retainAll(): " + s);

        // clear()
        s.clear();
        System.out.println("clear(): " + s);

        // isEmpty()
        System.out.println("isEmpty(): " + s.isEmpty());
    }
}