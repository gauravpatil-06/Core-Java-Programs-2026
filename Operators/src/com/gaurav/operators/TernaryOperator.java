package com.gaurav.operators;

public class TernaryOperator {

    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        // Ternary operator: condition ? trueValue : falseValue
        int max = (a > b) ? a : b;

        System.out.println("Greater value is : " + max);
    }
}