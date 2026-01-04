package com.gaurav.operators;

public class SpecialOperators {

    public static void main(String[] args) {

        // instanceof operator
        String name = "Java";
        System.out.println(name instanceof String); // true

        // Dot (.) operator – access method
        System.out.println(name.length()); // 4

        // Array access operator []
        int[] arr = {10, 20, 30};
        System.out.println(arr[0]); // 10

        // Method call operator ()
        show();
    }

    // Method for method call example
    static void show() {
        System.out.println("Method called");
    }
}