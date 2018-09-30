package com.problems;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Kiran on 9/11/18.
 * Users on longer flights like to start a second movie right when their first one ends, but they complain that the plane usually lands before they can see the ending. So you're building a feature for choosing two movies whose total runtimes will equal the exact flight length.
 * <p>
 * Write a method that takes an integer flightLength (in minutes) and an array of integers movieLengths (in minutes) and returns a boolean indicating whether there are two numbers in movieLengths whose sum equals flightLength.
 * <p>
 * When building your method:
 * <p>
 * Assume your users will watch exactly two movies
 * Don't make your users watch the same movie twice
 * Optimize for runtime over memory
 */
public class InFlightEntertainment {

    // This has O(N2)
    // To be efficient: 1. i could sort the movie length, then look for the differences.
    // That would give me: Sort: (nlogn), binary Search: O(logn)
    // We can do better. What if lookup time is O(1).
    public static boolean haveTwoMovies(int flightLength, int[] moviesLengths) {
        for (int i = 0; i < moviesLengths.length; i++) {
            for (int j = 0; j < moviesLengths.length; j++) {
                if (i != j) {
                    if (moviesLengths[i] + moviesLengths[j] == flightLength) {
                        return true;
                    }
                }
            }
        }
        return false;
    }


    // O(NlogN)
    public static void mergeSort(int[] numbers, int low, int high) {
        if (low < high) {
            int mid = (low + high) / 2;
            mergeSort(numbers, low, mid);
            mergeSort(numbers, mid + 1, high);
            merge(numbers, low, mid, high);
        }
    }

    public static void merge(int[] numbers, int low, int mid, int high) {
        int leftSize = mid - low + 1;
        int rightSize = high - mid;
        int[] temp1 = new int[leftSize];
        int[] temp2 = new int[rightSize];

        for (int i = 0; i < leftSize; i++) {
            temp1[i] = numbers[low + i];
        }

        for (int i = 0; i < rightSize; i++) {
            temp2[i] = numbers[mid + 1 + i];
        }


        int i = 0;
        int j = 0;
        int k = low;
        while (i < leftSize && j < rightSize) {
            if (temp1[i] <= temp2[j]) {
                numbers[k] = temp1[i];
                i++;
            } else {
                numbers[k] = temp2[j];
                j++;
            }
            k++;
        }

        while (i < leftSize) {
            numbers[k] = temp1[i];
            i++;
            k++;
        }
        while (j < rightSize) {
            numbers[k] = temp2[j];
            j++;
            k++;
        }


    }

    // O(logN)
    public static boolean binarySearch(int[] moviesLengths, int low, int high, int key) {
        if (low <= high) {
            int mid = (low + high) / 2;
            if (moviesLengths[mid] == key) {
                return true;
            }
            if (key < moviesLengths[mid]) {
                return binarySearch(moviesLengths, low, mid - 1, key);
            }
            if (key > moviesLengths[mid]) {
                return binarySearch(moviesLengths, mid + 1, high, key);
            }
        }
        return false;
    }


    // O(nLogN)
    public static boolean haveTwoMoviesWithSort(int flightLength, int[] moviesLengths) {

        mergeSort(moviesLengths, 0, moviesLengths.length - 1); // O(nLogN)

        for (int i = 0; i < moviesLengths.length; i++) {
            int iNeed = flightLength - moviesLengths[i];
            if (binarySearch(moviesLengths, 0, moviesLengths.length-1, iNeed)){ // O(logN)
                return true;
            }
        }
        return false;
    }


    // Best solution with complexity O(n) and space of O(n)
    public static boolean haveTwoMoviesWithHash(int flightLength, int[] movieLengths) {

        Set<Integer> movieLengthsSeen = new HashSet<>();
        for (int movie: movieLengths){
            int movieINeed = flightLength-movie;
            if (movieLengthsSeen.contains(movieINeed)){
                return true;
            }
            movieLengthsSeen.add(movie);
        }
        return false;
    }



    public static void main(String[] args) {

        long startTime1 = System.nanoTime();
        int[] mo = new int[]{20, 19, 3,80, 2, 4, 34, 23, 43, 19, 3, 2, 4, 34, 23, 43,19, 3, 2, 4, 34, 23, 43,19, 3, 2, 4, 34, 23, 43,19, 3, 2, 4, 34, 23, 43,19, 3, 2, 4, 34, 23, 43,19, 3, 2, 4, 34, 23, 43,19, 3, 2, 4, 34, 23, 43,19, 3, 2, 4, 34, 23, 43,19, 3, 2, 4, 34, 23, 43,19, 3, 2, 4, 34, 23, 43,5};
        System.out.println(haveTwoMovies(100, mo));
        long endTime1   = System.nanoTime();
        long totalTime1 = endTime1 - startTime1;

        long startTime2 = System.nanoTime();
        System.out.println(haveTwoMoviesWithSort(100, mo));
        long endTime2   = System.nanoTime();
        long totalTime2 = endTime2 - startTime2;


        long startTime3 = System.nanoTime();
        System.out.println(haveTwoMoviesWithHash(100, mo));
        long endTime3   = System.nanoTime();
        long totalTime3 = endTime3 - startTime3;


        if(totalTime1 < totalTime2){
            System.out.println("First datastructure is faster");
        }else{
            System.out.println("Second datastructure is faster");
        }

        if(totalTime2 > totalTime3){
            System.out.println("Third datastructure is faster");
        }

    }
}
