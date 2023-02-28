package com.bridgelabz.basics;

public class Statements1 {

    // 3 types ->  sequential , selection , repetition
    public static void main(String[] args) {

        // if-else
//        int x = 52;
//        if (x > 30) {
//            System.out.println("x is greater than 30");
//        } else {
//            System.out.println("x is not greater than 30");
//        }

        // if-else-if
//        if (x > 30 && x < 50) {
//            System.out.println("x > 30 && x < 50");
//        } else if (x > 25 && x <= 29) {
//            System.out.println("x > 25 && x <= 29");
//        } else if (x >= 20 && x <= 24) {
//            System.out.println("x >= 20 && x <= 24");
//        } else {
//            System.out.println("x < 20 or x >= 50");
//        }



        // switch
        int y = 2;

        switch(y) {
            case 1:
                System.out.println("y is 1");
                break;
            case 2:
                System.out.println("y is 2");
                break;
            case 3:
                System.out.println("y is 3");
                break;
            case 4:
                System.out.println("y is 4");
                break;
            default:
                System.out.println("default");
        }

        char ch = 'B';

        switch(ch) {
            case 'A':
                System.out.println("ch is A");
                break;
            case 'D':
                System.out.println("ch is D");
                break;
            case 'C':
                System.out.println("ch is C");
                break;
            case 'B':
                int x = 10;
                int z = 20;
                int sum = x+z;
                System.out.println(sum);
                System.out.println("ch is B");
                break;
            default:
                System.out.println("default");
        }
    }
}
