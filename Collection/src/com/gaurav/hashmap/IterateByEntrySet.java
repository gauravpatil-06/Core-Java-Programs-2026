package com.gaurav.hashmap;

import java.util.HashMap;
import java.util.Map;

public class IterateByEntrySet
{
    public static void main(String[] args)
    {
        // Create HashMap
        HashMap<String, String> hm = new HashMap<String, String>();

        hm.put("Gaurav", "Full Stack Java Developer");
        hm.put("Bhagyesh", "Frontend Developer");
        hm.put("Vikas", "UI Developer");
        hm.put("Suraj", "Python Developer");
        hm.put("Abhishek", "Android Developer");
        hm.put("Akash", "Backend Developer");
        hm.put("Vinod", "Web Developer");
        hm.put("Vitthal", "Backend Developer");

        // Method 1
        // Set<Map.Entry<String, String>> map = hm.entrySet();
        //
        // for (Map.Entry<String, String> e : map)
        // {
        //     System.out.println(e.getKey() + " => " + e.getValue());
        // }

        // Method 2 (direct & preferred)
        for (Map.Entry<String, String> e : hm.entrySet())
        {
            System.out.println(e.getKey() + " => " + e.getValue());
        }
    }
}