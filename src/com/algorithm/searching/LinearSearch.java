package com.algorithm.searching;

/**
 * Created by Kiran on 9/20/18.
 */
public class LinearSearch {


    public static int linearSearch(int[] arr, int k){
        if (arr == null || arr.length == 0 ){
            throw new IllegalArgumentException("Array most have some value");
        }
        for (int i =0; i < arr.length; i++){
            if (arr[i] == k){
                return i;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        int arr[] = {64, 34, 25, 12, 22, 11, 90};
        int k = -1;

        System.out.println(linearSearch(null, k));
    }
}
