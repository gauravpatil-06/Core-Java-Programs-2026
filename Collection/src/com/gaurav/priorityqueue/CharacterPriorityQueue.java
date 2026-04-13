package com.gaurav.priorityqueue;

import java.util.PriorityQueue;

public class CharacterPriorityQueue
{
    public static void main(String[] args)
    {
        PriorityQueue<Character> pq = new PriorityQueue<Character>();

        pq.add('A');
        pq.add('B');
        pq.add('C');
        pq.add('D');
        pq.add('E');
        pq.add('F');
        pq.add('G');
        pq.add('H');
        pq.add('I');
        pq.add('J');

        System.out.println(pq);
    }
}