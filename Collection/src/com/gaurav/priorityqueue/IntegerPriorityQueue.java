package com.gaurav.priorityqueue;

import java.util.PriorityQueue;

public class IntegerPriorityQueue
{
    public static void main(String[] args)
    {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();

        pq.add(10);
        pq.add(20);
        pq.add(30);
        pq.add(40);
        pq.add(50);
        pq.add(60);
        pq.add(70);
        pq.add(80);
        pq.add(90);
        pq.add(100);

        System.out.println(pq);
    }
}