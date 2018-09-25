package com.algorithm.sorting.divideNconquer;

import java.util.Arrays;

/**
 * Created by Kiran on 9/20/18.
 *
 * Time Complexity: O(nlogn)
 * Space Complexity: O(n)
 */
public class MergeSort {


    static void mergeSort(int[] arr, int low, int high){

        if(low < high){
            int mid = (high + low)/2;
            mergeSort(arr, low, mid);
            mergeSort(arr, mid+1, high);
            merge(arr, low, mid, high);
        }
    }


    static void merge(int[] arr, int low, int mid, int high){

        int leftASize = mid - low + 1;
        int rightSize = high - mid;

        int[] leftArr = new int[leftASize];
        int[] rightArr = new int[rightSize];

        for (int i =0; i < leftASize; i++){
            leftArr[i] = arr[low+i];
        }

        for (int j =0; j < rightSize; j++){
            rightArr[j] = arr[mid+j+1];
        }


        int i =0;
        int j =0;
        int k = low;

        while (i < leftASize && j <rightSize){
                if (leftArr[i] <= rightArr[j]){
                    arr[k] = leftArr[i];
                    i++;
                }else {
                    arr[k] = rightArr[j];
                    j++;
                }
            k++;
        }

        while(i < leftASize){
            arr[k] = leftArr[i];
            i++;
            k++;
        }

        while(j < rightSize){
            arr[k] = rightArr[j];
            j++;
            k++;
        }
    }


    public static void main(String[] args) {
        int arr[] = {64, 34, 25, 12, 22, 11, 90};
        mergeSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }



}
