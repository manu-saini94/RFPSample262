package com.bridgelabz.basics;

import java.util.Scanner;

public class MainClass1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int limit = in.nextInt();
        int[] array = new int[limit];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < limit; i++)
            array[i] = in.nextInt();

        int[] visitedArray = new int[limit];

        int visited = -1;
        for (int i = 0; i < limit; i++) {
            if (visitedArray[i] != visited) {
                int count = 1;
                for (int j = i + 1; j < limit; j++) {
                    if (array[i] == array[j]) {
                        count++; // 2
                        visitedArray[j] = visited;
                    }
                }
                visitedArray[i] = count;
            }
        }
        System.out.println("**********************************");
        System.out.println("  Elements : Frequency");
        for (int i = 0; i < visitedArray.length; i++) {
            if (visitedArray[i] != visited)
                System.out.println("     " + array[i] + "     :     " + visitedArray[i]);
        }
    }
}
