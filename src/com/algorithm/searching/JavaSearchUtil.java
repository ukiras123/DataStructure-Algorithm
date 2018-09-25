package com.algorithm.searching;

import java.util.*;

/**
 * Created by Kiran on 9/20/18.
 */
public class JavaSearchUtil {

    public static void main(String[] args) {
        Integer arr[] = {64, 34, 25, 12, 22, 11, 90};
        Arrays.sort(arr);
        int x = Arrays.binarySearch(args, 23);
        System.out.println(x);

        // Arrays.binarySearch() vs Collections.binarySearch();
        // Arrays.binarysearch() works for arrays which can be of primitive data type also. Collections.binarysearch() works for objects Collections like ArrayList and LinkedList.
        List<Integer> arrList = Arrays.asList(arr);
        Collections.sort(arrList, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        });
        int k = Collections.binarySearch(arrList, 3);
        System.out.println(k);

    }




}
