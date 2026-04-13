package com.gaurav.priorityqueue;

import java.util.PriorityQueue;

public class FloatPriorityQueue
{
    public static void main(String[] args)
    {
        PriorityQueue<Float> pq = new PriorityQueue<Float>();

        pq.add(10.5f);
        pq.add(20.5f);
        pq.add(30.5f);
        pq.add(40.5f);
        pq.add(50.5f);
        pq.add(60.5f);
        pq.add(70.5f);
        pq.add(80.5f);
        pq.add(90.5f);
        pq.add(100.5f);

        System.out.println(pq);
    }
}