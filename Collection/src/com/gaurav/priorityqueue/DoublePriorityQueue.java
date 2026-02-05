package com.gaurav.priorityqueue;

import java.util.PriorityQueue;

public class DoublePriorityQueue
{
    public static void main(String[] args)
    {
        PriorityQueue<Double> pq = new PriorityQueue<Double>();

        pq.add(100.50);
        pq.add(200.50);
        pq.add(300.50);
        pq.add(400.50);
        pq.add(500.50);
        pq.add(600.50);
        pq.add(700.50);
        pq.add(800.50);
        pq.add(900.50);
        pq.add(1000.50);

        System.out.println(pq);
    }
}