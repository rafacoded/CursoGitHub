package com.example.unittest;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hola desde proyecto intellij");
        System.out.println("2 + 3 = " + add(2, 3));
        System.out.println("5 - 2 = " + subtract(5, 2));
        System.out.println("4 * 3 = " + multiply(4, 3));
        System.out.println("8 / 2 = " + divide(8, 2));
        System.out.println("5 al cuadrado = " + square(5));
        System.out.println("Raíz cuadrada 16 = " + squareRoot(16));
        System.out.println("2^3 = " + Math.pow(2, 3));
        System.out.println("Factorial of 5 = " + factorial(5));
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }

        return a / b;
    }

    public static int square(int a) {
        return a * a;
    }

    public static int squareRoot(int a) {
        if (a < 0) {
            throw new IllegalArgumentException("Cannot take square root of negative number");
        }
        return (int) Math.sqrt(a);
    }


    public static int factorial(int a) {
        if (a < 0) {
            throw new IllegalArgumentException("Cannot take factorial of negative number");
        }
        int result = 1;
        for (int i = 1; i <= a; i++) {
            result *= i;
        }
        return result;
    }

}