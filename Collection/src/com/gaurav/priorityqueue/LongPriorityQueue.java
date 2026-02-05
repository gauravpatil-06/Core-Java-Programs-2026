package com.gaurav.priorityqueue;

import java.util.PriorityQueue;

public class LongPriorityQueue
{
    public static void main(String[] args)
    {
        PriorityQueue<Long> pq = new PriorityQueue<Long>();

        pq.add(1000000000000000L);
        pq.add(2000000000000000L);
        pq.add(3000000000000000L);
        pq.add(4000000000000000L);
        pq.add(5000000000000000L);
        pq.add(6000000000000000L);
        pq.add(7000000000000000L);
        pq.add(8000000000000000L);
        pq.add(9000000000000000L);
        pq.add(10000000000000000L);

        System.out.println(pq);
    }
}