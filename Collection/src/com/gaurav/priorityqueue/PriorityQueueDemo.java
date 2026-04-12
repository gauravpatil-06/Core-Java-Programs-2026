package com.gaurav.priorityqueue;

import java.util.PriorityQueue;

public class PriorityQueueDemo
{
    public static void main(String[] args)
    {
        // PriorityQueue using homogeneous data (Integer)
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();

        pq.add(-15);
        pq.add(42);
        pq.add(-7);
        pq.add(18);
        pq.add(60);
        pq.add(3);
        pq.add(-25);
        pq.add(35);
        pq.add(9);
        pq.add(27);

        // Display elements (priority order)
        System.out.println(pq);
    }
}