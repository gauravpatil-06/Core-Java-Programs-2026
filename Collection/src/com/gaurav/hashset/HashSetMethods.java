package com.gaurav.hashset;

import java.util.HashSet;

public class HashSetMethods
{
    public static void main(String[] args)
    {
        // Create HashSet objects
        HashSet<String> hs = new HashSet<String>();
        HashSet<String> hs2 = new HashSet<String>();

        // add() → Adds elements
        hs.add("Gaurav");
        hs.add("Vinod");
        hs.add("Bhagyesh");
        hs.add("Suraj");
        hs.add("Vikas");
        hs.add("Abhishek");
        hs.add("Vitthal");
        hs.add("Akash");
        hs.add("Praful");
        hs.add("Gaurav"); // Duplicate not allowed

        // add() elements to second HashSet
        hs2.add("Gaurav");
        hs2.add("Vinod");
        hs2.add("Bhagyesh");
        hs2.add("Suraj");
        hs2.add("Vikas");

        // size()
        System.out.println("size(): " + hs.size());

        // contains()
        System.out.println("contains(): " + hs.contains("Gaurav"));

        // addAll()
        hs.addAll(hs2);
        System.out.println("addAll(): " + hs);

        // remove()
        hs.remove("Akash");
        System.out.println("remove(): " + hs);

        // removeAll()
        hs.removeAll(hs2);
        System.out.println("removeAll(): " + hs);

        // retainAll()
        hs.retainAll(hs2);
        System.out.println("retainAll(): " + hs);

        // equals()
        System.out.println("equals(): " + hs.equals(hs2));

        // toArray()
        Object[] arr = hs.toArray();
        System.out.println("toArray length: " + arr.length);

        // clear()
        hs.clear();
        System.out.println("clear(): " + hs);

        // isEmpty()
        System.out.println("isEmpty(): " + hs.isEmpty());
    }
}