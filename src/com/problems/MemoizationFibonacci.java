package com.problems;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Kiran on 9/27/18.
 * <p>
 * Finding the nth number of fibonacci using memoization
 */
public class MemoizationFibonacci {


    // Recursive Fibonacci
    // O(2^n)
    public static int fib(int n) {

        if (n < 0) {
            throw new IllegalArgumentException(
                    "Index was negative. No such thing as a negative index in a series.");
        }

        // base cases
        if (n == 0 || n == 1) {
            return n;
        }

        System.out.printf("computing fib(%d)\n", n);
        return fib(n - 1) + fib(n - 2);
    }



    // Fibonacci with Memoization
    // O(n)
    private Map<Integer, Integer> memo = new HashMap<>();

    public int fibMemo(int n) {

        if (n < 0) {
            throw new IllegalArgumentException(
                    "Index was negative. No such thing as a negative index in a series.");

            // base cases
        } else if (n == 0 || n == 1) {
            return n;
        }

        // see if we've already calculated this
        if (memo.containsKey(n)) {
            System.out.printf("grabbing memo[%d]\n", n);
            return memo.get(n);
        }

        System.out.printf("computing fib(%d)\n", n);
        int result = fibMemo(n - 1) + fibMemo(n - 2);

        // memoize
        memo.put(n, result);

        return result;
    }


    // O(n) complexity, O(1) space
    public static int fibBottomUp(int n) {

        // edge cases:
        if (n < 0) {
            throw new IllegalArgumentException("Index was negative. No such thing as a negative index in a series.");
        } else if (n == 0 || n == 1) {
            return n;
        }

        // we'll be building the fibonacci series from the bottom up
        // so we'll need to track the previous 2 numbers at each step
        int prevPrev = 0;  // 0th fibonacci
        int prev = 1;      // 1st fibonacci
        int current = 0;   // Declare and initialize current

        for (int i = 1; i < n; i++) {

            // Iteration 1: current = 2nd fibonacci
            // Iteration 2: current = 3rd fibonacci
            // Iteration 3: current = 4th fibonacci
            // To get nth fibonacci ... do n-1 iterations.
            current = prev + prevPrev;
            prevPrev = prev;
            prev = current;
        }

        return current;
    }

}
