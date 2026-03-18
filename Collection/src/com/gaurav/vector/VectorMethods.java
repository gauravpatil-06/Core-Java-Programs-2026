package com.gaurav.vector;

import java.util.Vector;

public class VectorMethods
{
    public static void main(String[] args)
    {
        // Create Vector objects
        Vector<String> v = new Vector<String>();   // Main Vector
        Vector<String> v2 = new Vector<String>();  // Second Vector

        // add() → Adds elements to the Vector
        v.add("Gaurav");
        v.add("Vinod");
        v.add("Bhagyesh");
        v.add("Suraj");
        v.add("Vikas");
        v.add("Abhishek");
        v.add("Vitthal");
        v.add("Akash");
        v.add("Praful");
        v.add("Gaurav"); // Duplicate elements are allowed

        // add() elements to second Vector
        v2.add("Gaurav");
        v2.add("Vinod");
        v2.add("Bhagyesh");
        v2.add("Suraj");
        v2.add("Vikas");

        // get(index) → Returns element at given index
        System.out.println("get(): " + v.get(0));

        // size() → Returns total number of elements
        System.out.println("size(): " + v.size());

        // contains() → Checks if element exists
        System.out.println("contains(): " + v.contains("Gaurav"));

        // indexOf() → Returns first index of element
        System.out.println("indexOf(): " + v.indexOf("Gaurav"));

        // lastIndexOf() → Returns last index of element
        System.out.println("lastIndexOf(): " + v.lastIndexOf("Gaurav"));

        // remove(index) → Removes and returns element
        System.out.println("remove(index): " + v.remove(0));
        System.out.println(v);

        // set(index, element) → Replaces element and returns old value
        System.out.println("set(): " + v.set(0, "Gaurav Patil"));
        System.out.println(v);

        // reversed() → Returns reversed view (Java 21+)
        System.out.println("reversed(): " + v.reversed());

        // addAll() → Adds all elements of another Vector
        v.addAll(v2);
        System.out.println("addAll(): " + v);

        // removeAll() → Removes all common elements
        v.removeAll(v2);
        System.out.println("removeAll(): " + v);

        // add(index, element) → Inserts element at index
        v.add(1, "Rahul");
        System.out.println("add(index): " + v);

        // remove(object) → Removes given object
        v.remove("Rahul");
        System.out.println("remove(object): " + v);

        // equals() → Compares two Vectors
        System.out.println("equals(): " + v.equals(v2));

        // toArray() → Converts Vector to Array
        Object[] arr = v.toArray();
        System.out.println("toArray length: " + arr.length);

        // retainAll() → Keeps only common elements
        v.retainAll(v2);
        System.out.println("retainAll(): " + v);

        // clear() → Removes all elements
        v.clear();
        System.out.println("clear(): " + v);

        // isEmpty() → Checks if Vector is empty
        System.out.println("isEmpty(): " + v.isEmpty());
    }
}