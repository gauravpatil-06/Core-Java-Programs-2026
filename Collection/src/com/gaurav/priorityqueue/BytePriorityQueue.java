package com.gaurav.priorityqueue;

import java.util.PriorityQueue;

public class BytePriorityQueue
{
    public static void main(String[] args)
    {
        PriorityQueue<Byte> pq = new PriorityQueue<Byte>();

        pq.add((byte)1);
        pq.add((byte)2);
        pq.add((byte)3);
        pq.add((byte)4);
        pq.add((byte)5);
        pq.add((byte)6);
        pq.add((byte)7);
        pq.add((byte)8);
        pq.add((byte)9);
        pq.add((byte)10);

        System.out.println(pq);
    }
}