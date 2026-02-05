package com.gaurav.hashmap;

import java.util.HashMap;

public class HashMapDemo
{
    public static void main(String[] args)
    {
        HashMap<String, String> hm = new HashMap<String, String>();

        hm.put("Gaurav", "Full Stack Java Developer");
        hm.put("Bhagyesh", "Frontend Developer");
        hm.put("Vikas", "UI Developer");
        hm.put("Suraj", "Python Developer");
        hm.put("Abhishek", "Android Developer");
        hm.put("Akash", "Backend Developer");
        hm.put("Vinod", "Web Developer");
        hm.put("Vitthal", "Backend Developer");

        hm.put("Gaurav", "Senior Full Stack Java Developer"); // duplicate key → value replace
        hm.put(null, "UI Developer");                  // one null key allowed
        hm.put("Intern", null);                        // null value allowed

        System.out.println(hm);
    }
}