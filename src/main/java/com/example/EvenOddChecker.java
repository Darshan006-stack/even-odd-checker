package com.example;

public class EvenOddChecker {

    public static boolean isEven(int n) {

        return n % 2 == 0;

    }

    public static void main(String[] args) {

        int n = (args.length > 0) ? Integer.parseInt(args[0]) : 7;

        System.out.println(n + " is " + (isEven(n) ? "Even" : "Odd"));

    }
}