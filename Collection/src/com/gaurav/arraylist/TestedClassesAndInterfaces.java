package com.gaurav.arraylist;

import java.util.*;

public class TestedClassesAndInterfaces 
{
    public static void main(String[] args) 
    {
        // List Interface implementations
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new LinkedList<>();
        List<String> list3 = new Vector<>();

        // Set Interface implementations
        Set<String> set1 = new HashSet<>();
        Set<String> set2 = new LinkedHashSet<>();
        Set<String> set3 = new TreeSet<>();

        // Queue Interface implementation
        Queue<String> queue1 = new PriorityQueue<>();

        // Deque Interface implementation
        Deque<String> deque1 = new ArrayDeque<>();
	}
}