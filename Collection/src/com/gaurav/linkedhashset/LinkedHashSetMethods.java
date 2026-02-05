package com.gaurav.linkedhashset;

import java.util.LinkedHashSet;

public class LinkedHashSetMethods
{
    public static void main(String[] args)
    {
        // Create LinkedHashSet objects
        LinkedHashSet<String> lhs = new LinkedHashSet<String>();
        LinkedHashSet<String> lhs2 = new LinkedHashSet<String>();

        // add() → Adds elements
        lhs.add("Gaurav");
        lhs.add("Vinod");
        lhs.add("Bhagyesh");
        lhs.add("Suraj");
        lhs.add("Vikas");
        lhs.add("Abhishek");
        lhs.add("Vitthal");
        lhs.add("Akash");
        lhs.add("Praful");
        lhs.add("Gaurav"); // Duplicate not allowed

        // add() elements to second LinkedHashSet
        lhs2.add("Gaurav");
        lhs2.add("Vinod");
        lhs2.add("Bhagyesh");

        // size()
        System.out.println("size(): " + lhs.size());

        // contains()
        System.out.println("contains(): " + lhs.contains("Suraj"));

        // addAll()
        lhs.addAll(lhs2);
        System.out.println("addAll(): " + lhs);

        // remove()
        lhs.remove("Akash");
        System.out.println("remove(): " + lhs);

        // equals()
        System.out.println("equals(): " + lhs.equals(lhs2));

        // toArray()
        Object[] arr = lhs.toArray();
        System.out.println("toArray length: " + arr.length);

        // retainAll()
        lhs.retainAll(lhs2);
        System.out.println("retainAll(): " + lhs);

        // clear()
        lhs.clear();
        System.out.println("clear(): " + lhs);

        // isEmpty()
        System.out.println("isEmpty(): " + lhs.isEmpty());
    }
}