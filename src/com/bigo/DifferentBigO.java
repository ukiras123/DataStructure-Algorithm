package com.bigo;

/**
 * Created by Kiran on 9/20/18.
 *
 * [1 < logn < √ n < n < nlogn < n^2 < n^3 < ... < 2^n < 3^n < n^n]
 */
public class DifferentBigO {

    public static void main(String[] args) {
        int[] arr = {1,3,4};
        int n = 100;

        System.out.println("-----------O(1)--------------");
        System.out.println(arr[2]);


        System.out.println("-----------O(log2n)--------------");
        for (int i = 0; i < n; i = i * 2) {
            System.out.println(n);
        }

        System.out.println("-----------O(log3n)--------------");
        for (int i = 0; i < n; i = i * 3) {
            System.out.println(n);
        }


        System.out.println("-----------O(n)--------------");
        for (int i = 0; i < n; i++) {
            System.out.println(n);
        }

        System.out.println("-----------O(nLogn)--------------");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j = j * 2) {
                System.out.println(n);
            }
        }

        System.out.println("-----------O(n^2)--------------");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j = j) {
                System.out.println(n);
            }
        }


        System.out.println("-----------O(2^n)--------------");
        System.out.println(Fibonacci(3));


    }

    static int Fibonacci(int number)
    {
        if (number <= 1) return number;

        return Fibonacci(number - 2) + Fibonacci(number - 1);
    }

}
