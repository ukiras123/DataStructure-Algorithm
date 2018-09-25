package com.algorithm.sorting;

/**
 * Created by Kiran on 9/20/18.
 * <p>
 * <p>
 * O(n+k) where n is the number of elements in input array and k is the range of input.
 */
// Java implementation of Counting Sort
class CountingSort {
    void sort(char arr[]) {

        // Counting array
        int count[] = new int[256];
        for (int i = 0; i < 256; i++) {
            count[i] = 0;
        }

        // store count of each character
        for (int i = 0; i < arr.length; ++i) {
            count[arr[i]] = count[arr[i]] + 1;
        }

        int k =0;
        for (int i =0; i < 256; i++){
            if (count[i] >=1){
                for (int j = 0; j < count[i]; j++){
                    arr[k] = (char) i;
                    k++;
                }
            }
        }


    }

    // Driver method
    public static void main(String args[]) {
        CountingSort ob = new CountingSort();
        char arr[] = {'g', 'e', 'e', 'k', 's', 'f', 'o',
                'r', 'g', 'e', 'e', 'k', 's'
        };

        ob.sort(arr);

        System.out.print("Sorted character array is ");
        for (int i = 0; i < arr.length; ++i)
            System.out.print(arr[i]);
    }
}