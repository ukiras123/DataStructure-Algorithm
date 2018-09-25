package com.algorithm.sorting;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by Kiran on 9/20/18.
 *
 *
 *
 */
public class JavaSortUtils {


    // Different java data type
    public static void main(String[] args) {
        Character arr[] = {'g', 'e', 'e', 'k', 's', 'f', 'o',
                'r', 'g', 'e', 'e', 'k', 's'
        };

        Arrays.sort(arr);  // Java sorts using Dual-Pivot Quicksort
        List<Character> g = Arrays.asList(arr);
        Collections.sort(g);
        System.out.println(arr);
        Math.min(3,4);
        short k = 12;
        int l = 123;
        long gds = 23432423;
        float sd = 12.3f;
        double d = 32.34;
    }
}
