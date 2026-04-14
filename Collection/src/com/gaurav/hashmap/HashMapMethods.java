package com.gaurav.hashmap;

import java.util.HashMap;

public class HashMapMethods
{
    public static void main(String[] args)
    {
        // Create HashMap object
        HashMap<String, String> hm = new HashMap<String, String>();

        // put() → Adds key-value pairs
        hm.put("Gaurav", "Full Stack Java Developer");
        hm.put("Bhagyesh", "Frontend Developer");
        hm.put("Vikas", "UI Developer");
        hm.put("Suraj", "Python Developer");
        hm.put("Abhishek", "Android Developer");
        hm.put("Akash", "Backend Developer");
        hm.put("Vinod", "Web Developer");
        hm.put("Vitthal", "Backend Developer");

        // Duplicate key → value replaced
        hm.put("Gaurav", "Senior Full Stack Java Developer");

        // null key and null value
        hm.put(null, "UI Developer");   // one null key allowed
        hm.put("Intern", null);         // null value allowed

        // keySet() → Returns all keys
        System.out.println("keySet(): " + hm.keySet());
        System.out.println("--------------------------------");

        // values() → Returns all values
        System.out.println("values(): " + hm.values());
        System.out.println("--------------------------------");

        // isEmpty() → Checks map is empty or not
        System.out.println("isEmpty(): " + hm.isEmpty());
        System.out.println("--------------------------------");

        // get(key) → Returns value of given key
        System.out.println("get(): " + hm.get("Gaurav"));
        System.out.println("--------------------------------");

        // containsKey()
        System.out.println("containsKey(): " + hm.containsKey("Gaurav"));
        System.out.println("--------------------------------");

        // containsValue()
        System.out.println("containsValue(): " + hm.containsValue("UI Developer"));
        System.out.println("--------------------------------");

        // replace(key, newValue)
        System.out.println("replace(): " + hm.replace("Vinod", "Java Developer"));
        System.out.println(hm);
        System.out.println("--------------------------------");

        // remove(key)
        System.out.println("remove(): " + hm.remove("Akash"));
        System.out.println("--------------------------------");

        // size()
        System.out.println("size(): " + hm.size());
    }
}