package com.bridgelabz.basics;

public class Test3 {

//    int x = 10; // instance
//    static int y = 20;  // static

    Student s1 = new Student(); // instance

    static Student s2 = new Student(); // static

    static void m1(float f){
        int x = 0;
    }
    // For main thread one runtime stack will be created
    // That runtime stack will contain stack frame for main method
    // one stack frame from m1()
    public static void main(String[] args) {


        Test3 t1 = new Test3();  // local   // instance variable also gets memory
        Student s3 = new Student(); // local

        m1(4.5f);

        int x = 52;
        if (x > 30) {
            System.out.println("x is greater than 30");
        } else {
            System.out.println("x is not greater than 30");
        }


    }
}
