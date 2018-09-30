package com.problems.palindrome;

/**
 * Created by Kiran on 9/29/18.
 */
public class IsPrime {

    // Simple Solution O(n)
    static boolean isPrime(int num) {
        // Corner case
        if (num <= 1) return false;

        // Check from 2 to n-1
        for (int i = 2; i < num; i++)
            if (num % i == 0)
                return false;

        return true;
    }


    //  Solution O(√n)
    static boolean isPrimeLittleBetter(int num)
    {
        if (num < 2 || num % 2 == 0)
            return num == 2;
        for (int i = 3; i * i <= num; i += 2)
            if (num % i == 0)
                return false;
        return true;
    }

    // Solution O(√n)
    // a larger factor of n must be a multiple of smaller factor
    // All Primes are of the form 6k +- 1
    static boolean isPrimeOptimizedFactorMethod(int num) {
        // Corner case
        if (num <= 1) return false;
        if (num <= 3) return true;

        if (num % 2 == 0 || num % 3 == 0) return false;

        for (int i = 5; i * i <= num; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }

}
