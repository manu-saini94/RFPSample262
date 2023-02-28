package com.bridgelabz.basics;

public class Test2 {

    public static void m3() {
        System.out.println("m3");
    }

    public static void m2() {
        System.out.println("m2");
        m3();
    }

    public static void m1(int i, double d, HelloWorld ref1, float f) {
        char ch = 'A';
        System.out.println("m1");
        m2();
    }

    public static void main(String[] args) {
        System.out.println("main");
        HelloWorld obj = new HelloWorld();
        m1(1, 4.5, obj, 4.6F);
    }
}
