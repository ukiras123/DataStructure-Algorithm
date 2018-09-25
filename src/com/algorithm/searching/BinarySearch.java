package com.algorithm.searching;

/**
 * Created by Kiran on 9/20/18.
 */
public class BinarySearch {


    public static int binarySearch(int[] arr, int k) {
        int n = arr.length;
        int left = 0;
        int right = n - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == k) {
                return mid;
            }

            if (k < arr[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }

        }
        return -1;
    }


    public static int binarySearchRecursive(int[] arr, int k) {
        return bSearchRec(arr, k, 0, arr.length - 1);
    }


    public static int bSearchRec(int[] arr, int k, int left, int right) {
        int mid = (left + right) / 2;
        if (arr[mid] == k){
            return mid;
        }
        if (left < right) {
            if (k < arr[mid]){
                return bSearchRec(arr, k, left, mid -1);
            }else{
                return bSearchRec(arr, k , mid+1, right);
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        int arr[] = {64, 34, 25, 12, 22, 11, 90};
        int k = Integer.MAX_VALUE;

        System.out.println(binarySearch(arr, k));
        System.out.println(binarySearchRecursive(arr, k));
    }
}




