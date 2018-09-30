package com.problems.palindrome;

/**
 * Created by Kiran on 9/29/18.
 */
public class IsPalindrome {

    boolean isPalindrome(String str, int l, int r)
    {
        while (l < r) {
            if (str.charAt(l) != str.charAt(r))
                return false;
            l++;
            r--;
        }
        return true;
    }

    boolean isPalindrome(String str)
    {
        int left = 0;
        int right = str.length() - 1;
        while(left < right){
            if (str.charAt(left) != str.charAt(right))
            {
                return false;
            }
                left ++;
                right ++;
        }
        return true;
    }

}
