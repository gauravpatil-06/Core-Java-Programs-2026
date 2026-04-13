package com.gaurav.priorityqueue;

import java.util.PriorityQueue;

public class ShortPriorityQueue
{
    public static void main(String[] args)
    {
        PriorityQueue<Short> pq = new PriorityQueue<Short>();

        pq.add((short)1);
        pq.add((short)2);
        pq.add((short)3);
        pq.add((short)4);
        pq.add((short)5);
        pq.add((short)6);
        pq.add((short)7);
        pq.add((short)8);
        pq.add((short)9);
        pq.add((short)10);

        System.out.println(pq);
    }
}