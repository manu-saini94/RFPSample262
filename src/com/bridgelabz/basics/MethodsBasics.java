package com.bridgelabz.basics;

import java.util.Scanner;

public class MethodsBasics {


    // 2 types => Static and Non-Static

    // we require a method for code reusability

    // Method definition
    public static int m1(int a, int b) {
        int sum = a + b;
        return sum;
    }


    public static float m3(float a, float b) {
        float sum =  a + b;
        return sum;
    }


    public static void m2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first value");
        int x = scanner.nextInt();
        System.out.println("Enter second value");
        int y = scanner.nextInt();
        int prod = x * y;
        System.out.println(prod);
    }


    public static void main(String[] args) {

        // Method call
        int sum = m1(10, 20);
        System.out.println("SUM1 :" + sum);

        int sum1 = m1(10, 40);
        System.out.println("SUM2 :" + sum1);

        int x1 = 20;
        int y1 = 30;
        int prod = x1 * y1;
        System.out.println("Prod :" + prod);

        m2();

    }
}
