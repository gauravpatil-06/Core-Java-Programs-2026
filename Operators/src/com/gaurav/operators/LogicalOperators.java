package com.gaurav.operators;

public class LogicalOperators {

    public static void main(String[] args) {

        // Declare and initialize variables
        int a = 10;
        int b = 20;
        boolean result;

        // Logical AND (&&)
        result = a < b && a == b;
        System.out.println("Logical AND : " + result);

        // Logical OR (||)
        result = a < b || a == b;
        System.out.println("Logical OR : " + result);

        // Logical NOT (!)
        result = !(a <= b);
        System.out.println("Logical NOT : " + result);
    }
}
