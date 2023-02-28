package com.bridgelabz.basics;

public class Statements2 {

    // Repetition
    public static void main(String[] args) {
        // for loop
        // while loop
        // do while loop

        // increment and decrement operators
        // ++ , --
        // post and pre increment , decrement operators
        // x++ , ++x , x-- , --x
        int x = 0;
        int sum = ++x;
        System.out.println(x); // 1
        System.out.println(sum); // 1

        int y = 0;
        int sum2 = y++;
        System.out.println(sum2); // 0
        System.out.println(y); // 1
        System.out.println();
        int a = 0;
        int diff = --a;
        System.out.println(a); // -1
        System.out.println(diff); // -1

        int b = 0;
        int diff2 = b--;
        System.out.println(diff2); // 0
        System.out.println(b); // -1

        int z = 21;
        int res1 = z++ + z++ + ++z + ++z + z++; // 21 + 22 + 24 + 25 + 25  = 117
        System.out.println(z); //26
        System.out.println(res1);// 117

        int res2 = z-- - z-- + z++ + --z + z-- - ++z + --z; // 26 - 25 + 24 + 24 + 24 - 24  + 23  =  72
        System.out.println(z); // 23
        System.out.println(res2); // 72
        System.out.println();

        for (int i = 0; i < 10; ++i) {
            System.out.println(i);
        }
        System.out.println("for ended");
        System.out.println();
        int k = 0;
        while (k < 10) {
            System.out.println(k);
            k++;
        }
        System.out.println(" while ended");
        System.out.println();

        int j = 10;
        do {
            System.out.println(j);
            j++;
        } while (j < 10);

        System.out.println("do while ended");

        int[] arr1 = new int[10];

        float[] arr2 = new float[5];


        arr1[0] = 10;
        arr1[9] = 30;
        arr1[1] = 40;
        arr1[2] = 2;
        System.out.println("foreach");
        for (int v:arr1) {
            System.out.println(v);
        }

        arr2[0] = 3.4F;
        arr2[1] = 5;
        System.out.println();
       for (int i = 0;i< arr2.length;i++){
           System.out.println(arr2[i]);
       }

    }
}
