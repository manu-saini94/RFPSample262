package com.bridgelabz.basics;

import java.lang.reflect.Method;

public class Test {

    public static void main(String[] args) {

        System.out.println("main starting");



        HelloWorld obj1 = new HelloWorld(); // class Class object is generated and stores in heap area

        HelloWorld obj2 = new HelloWorld(); //

        HelloWorld obj3 = new HelloWorld();

        try {
            Class c1 = Class.forName("com.bridgelabz.basics.HelloWorld");
            Method[] m1 = c1.getDeclaredMethods();
            int count = 0;
            for (Method m:m1) {
                count++;
                System.out.println(m.getName());
            }
            System.out.println(count);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        System.out.println("main ending");

    }
}
