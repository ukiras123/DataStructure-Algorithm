package com.problems.interesting;

/**
 * Created by Kiran on 9/9/18.
 */
public class RotatedSortedArray {
    static int i = 0;

    public static int searchMe(int[] numbers, int find) {
        int size = numbers.length;
        return searchRotatedSortedArray(numbers, find, 0, size - 1);
    }

    public static int searchRotatedSortedArray(int[] numbers, int find, int low, int high) {
        i++;
        int mid = (low + high) / 2;

        if (numbers[mid] == find) {
            return mid;
        } else if (numbers[low] == find) {
            return low;
        } else if (numbers[high] == find) {
            return high;
        }

        if (high < low) {
            return -1;
        }

        if (numbers[mid] > numbers[low]) {
            if (find < numbers[mid] && find > numbers[low]) {
                return binarySearch(numbers, find, low, mid - 1);
            } else {
                return searchRotatedSortedArray(numbers, find, mid + 1, high);
            }
        } else if (numbers[mid] < numbers[high]) {
            if (find < numbers[high] && find > numbers[mid]) {
                return binarySearch(numbers, find, mid + 1, high);
            } else {
                return searchRotatedSortedArray(numbers, find, low, mid - 1);
            }
        }
        return -1;

    }

    public static int binarySearch(int[] numbers, int find, int low, int high) {
        i++;
        if (high < low) {
            return -1;
        }

        int mid = (low + high) / 2;
        if (numbers[mid] == find) {
            return mid;
        }

        if (numbers[mid] > find) {
            return binarySearch(numbers, find, low, mid - 1);
        } else {
            return binarySearch(numbers, find, mid + 1, high);
        }
    }


    public static void main(String args[]) {
        int[] sortedArray = {23,44,66,8, 8,8,8,8,8,8,9,10,10};
        int find = 9;
        int found = searchMe(sortedArray, find);

        if (found != -1)
            System.out.println("Number found @ index " + found+" and it took "+i+" steps");
        else
            System.out.println("Number not found and it took "+i+" steps");

    }


}
