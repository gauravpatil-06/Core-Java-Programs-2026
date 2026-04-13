package com.gaurav.priorityqueue;

import java.util.PriorityQueue;

public class StringPriorityQueue
{
    public static void main(String[] args)
    {
        PriorityQueue<String> pq = new PriorityQueue<String>();

        pq.add("Gaurav");
        pq.add("Vinod");
        pq.add("Bhagyesh");
        pq.add("Suraj");
        pq.add("Vikas");
        pq.add("Abhishek");
        pq.add("Vitthal");
        pq.add("Akash");
        pq.add("Praful");
        pq.add("Pavan");

        System.out.println(pq);
    }
}