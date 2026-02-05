package com.gaurav.linkedlist;

import java.util.LinkedList;

public class BooleanLinkedList
{
    public static void main(String[] args)
    {
        LinkedList<Boolean> ll = new LinkedList<Boolean>();

        ll.add(true);
        ll.add(false);
        ll.add(true);
        ll.add(false);
        ll.add(true);
        ll.add(false);
        ll.add(true);
        ll.add(false);
        ll.add(true);
        ll.add(false);

        System.out.println(ll);
    }
}