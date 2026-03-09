package com.gaurav.linkedlist;

import java.util.LinkedList;

public class LinkedListMethods
{
    public static void main(String[] args)
    {
        // Create LinkedList objects
        LinkedList<String> ll = new LinkedList<String>();   // Main LinkedList
        LinkedList<String> ll2 = new LinkedList<String>();  // Second LinkedList

        // add() → Adds elements to the LinkedList
        ll.add("Gaurav");
        ll.add("Vinod");
        ll.add("Bhagyesh");
        ll.add("Suraj");
        ll.add("Vikas");
        ll.add("Abhishek");
        ll.add("Vitthal");
        ll.add("Akash");
        ll.add("Praful");
        ll.add("Gaurav"); // Duplicate elements are allowed

        // add() elements to second LinkedList
        ll2.add("Gaurav");
        ll2.add("Vinod");
        ll2.add("Bhagyesh");
        ll2.add("Suraj");
        ll2.add("Vikas");

        // get(index) → Returns element at given index
        System.out.println("get(): " + ll.get(0));

        // size() → Returns total number of elements
        System.out.println("size(): " + ll.size());

        // contains() → Checks if element exists
        System.out.println("contains(): " + ll.contains("Gaurav"));

        // indexOf() → Returns first index of element
        System.out.println("indexOf(): " + ll.indexOf("Gaurav"));

        // lastIndexOf() → Returns last index of element
        System.out.println("lastIndexOf(): " + ll.lastIndexOf("Gaurav"));

        // remove(index) → Removes and returns element
        System.out.println("remove(index): " + ll.remove(0));
        System.out.println(ll);

        // set(index, element) → Replaces element and returns old value
        System.out.println("set(): " + ll.set(0, "Gaurav Patil"));
        System.out.println(ll);

        // reversed() → Returns reversed view (Java 21+)
        System.out.println("reversed(): " + ll.reversed());

        // addAll() → Adds all elements of another LinkedList
        ll.addAll(ll2);
        System.out.println("addAll(): " + ll);

        // removeAll() → Removes all common elements
        ll.removeAll(ll2);
        System.out.println("removeAll(): " + ll);

        // add(index, element) → Inserts element at index
        ll.add(1, "Rahul");
        System.out.println("add(index): " + ll);

        // remove(object) → Removes given object
        ll.remove("Rahul");
        System.out.println("remove(object): " + ll);

        // equals() → Compares two LinkedLists
        System.out.println("equals(): " + ll.equals(ll2));

        // toArray() → Converts LinkedList to Array
        Object[] arr = ll.toArray();
        System.out.println("toArray length: " + arr.length);

        // retainAll() → Keeps only common elements
        ll.retainAll(ll2);
        System.out.println("retainAll(): " + ll);

        // clear() → Removes all elements
        ll.clear();
        System.out.println("clear(): " + ll);

        // isEmpty() → Checks if LinkedList is empty
        System.out.println("isEmpty(): " + ll.isEmpty());
    }
}