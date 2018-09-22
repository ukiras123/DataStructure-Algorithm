package com.datastructure.array;

/**
 * Created by Kiran on 9/20/18.
 */
// Java program to demonstrate use of circular
// array using extra memory space

public class CircularArray {

    // function to print circular list
    // starting from given index ind.
    public static void print(char a[], int n, int ind) {

        for (int i = ind; i< n+ind; i++){
            System.out.println(a[i%n]+" ");
        }

    }

    // driver code to check the above function
    public static void main(String argc[]) {
        char[] a = new char[]{'A', 'B', 'C', 'D', 'E', 'F'};
        int n = 6;
        print(a, n, 3);
    }
}
