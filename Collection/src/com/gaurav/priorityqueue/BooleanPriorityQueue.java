package com.gaurav.priorityqueue;

import java.util.PriorityQueue;

public class BooleanPriorityQueue
{
    public static void main(String[] args)
    {
        PriorityQueue<Boolean> pq = new PriorityQueue<Boolean>();

        pq.add(true);
        pq.add(false);

        System.out.println(pq);
    }
}