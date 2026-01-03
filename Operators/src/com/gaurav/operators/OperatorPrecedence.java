package com.gaurav.operators;

public class OperatorPrecedence {

    public static void main(String[] args) {

        // Without brackets
        int a = 10 + 5 * 2;
        System.out.println(a);

        // With brackets
        int b = (10 + 5) * 2;
        System.out.println(b);

        // Mixed operators
        int c = 20 / 5 + 3 * 2;
        System.out.println(c);

        // Unary + arithmetic
        int d = ++a * 2;
        System.out.println(d);
    }
}