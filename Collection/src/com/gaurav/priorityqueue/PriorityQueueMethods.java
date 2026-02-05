package com.gaurav.priorityqueue;

import java.util.PriorityQueue;

public class PriorityQueueMethods
{
    public static void main(String[] args)
    {
        // Create PriorityQueue objects
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();   // Main Queue
        PriorityQueue<Integer> pq2 = new PriorityQueue<Integer>();  // Second Queue

        // add() → Adds elements
        pq.add(20);
        pq.add(10);
        pq.add(40);
        pq.add(30);
        pq.add(50);
        pq.add(10); // duplicate allowed

        // add() elements to second queue
        pq2.add(10);
        pq2.add(20);
        pq2.add(30);

        // peek() → Returns head element, does NOT remove
        System.out.println("peek(): " + pq.peek());

        // element() → Returns head element, throws exception if empty
        System.out.println("element(): " + pq.element());

        // poll() → Removes and returns head element
        System.out.println("poll(): " + pq.poll());
        System.out.println("After poll(): " + pq);

        // size()
        System.out.println("size(): " + pq.size());

        // contains()
        System.out.println("contains(): " + pq.contains(20));

        // addAll()
        pq.addAll(pq2);
        System.out.println("addAll(): " + pq);

        // remove(object)
        pq.remove(20);
        System.out.println("remove(object): " + pq);

        // removeAll()
        pq.removeAll(pq2);
        System.out.println("removeAll(): " + pq);

        // equals()
        System.out.println("equals(): " + pq.equals(pq2));

        // toArray()
        Object[] arr = pq.toArray();
        System.out.println("toArray length: " + arr.length);

        // clear()
        pq.clear();
        System.out.println("clear(): " + pq);

        // isEmpty()
        System.out.println("isEmpty(): " + pq.isEmpty());
    }
}