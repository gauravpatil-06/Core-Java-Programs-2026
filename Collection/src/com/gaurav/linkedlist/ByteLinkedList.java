package com.gaurav.linkedlist;

import java.util.LinkedList;

public class ByteLinkedList
{
    public static void main(String[] args)
    {
        LinkedList<Byte> ll = new LinkedList<Byte>();

        ll.add((byte)1);
        ll.add((byte)2);
        ll.add((byte)3);
        ll.add((byte)4);
        ll.add((byte)5);
        ll.add((byte)6);
        ll.add((byte)7);
        ll.add((byte)8);
        ll.add((byte)9);
        ll.add((byte)10);

        System.out.println(ll);
    }
}