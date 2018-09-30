package com.problems.palindrome;

/**
 * Created by Kiran on 9/29/18.
 *
 * a palindromic number having even number of digits is always divisible by 11.
 */
public class IsEvenNumberPalindrome {

    static boolean isPalindrome(int n)
    {
        // if divisible by 11 then true
        if (n % 11 == 0)
        {
            return true;
        }

        // if not divisible by 11
        return false;
    }

    // Driver code
    public static void main(String[] args)
    {
        System.out.println(isPalindrome(112211) ?
                "Palindrome" :
                "Not Palindrome");
    }
}
