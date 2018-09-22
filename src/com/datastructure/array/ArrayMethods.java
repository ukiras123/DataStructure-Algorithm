package com.datastructure.array;

import java.util.*;

/**
 * Created by Kiran on 9/20/18.
 */
public class ArrayMethods {
    public static void main(String[] args) {

        // String representation of array
        int ar[] = {4, 6, 1, 8, 3, 9, 7, 4, 2};
        // To print the elements in one line
        System.out.println("Arrays.toString: " + Arrays.toString(ar));


        // Sort array
        Arrays.sort(ar);
        System.out.println("Arrays.sort(): " + Arrays.toString(ar));

        // Sort array
        int ar2[] = {4, 6, 1, 8, 3, 9, 7, 4, 2};
        Arrays.sort(ar2, 3, 6);
        System.out.println("Arrays.sort(arr, from , to): " + Arrays.toString(ar2));

        //Binary Search
        Arrays.sort(ar2);
        System.out.println("Arrays.binarySearch(arr,key): " + Arrays.binarySearch(ar2, 8));

        //Copy an array
        int[] copyArray = Arrays.copyOf(ar2, 10);
        System.out.println("Arrays.copyOf: " + Arrays.toString(copyArray));

        // Copy Range of Array
        int[] rangeCopy = Arrays.copyOfRange(ar2, 3, 7);
        System.out.println("Arrays.copyOfRange: " + Arrays.toString(rangeCopy));

        //Fill Array
        int[] emptyArray = new int[10];
        Arrays.fill(emptyArray, 10);
        System.out.println("Arrays.fill: " + Arrays.toString(emptyArray));

        // Change Array to a ArrayList
        Integer[] ar4 = {4, 6, 1, 8, 3, 9, 7, 4, 2};
        // Creates a wrapper list over ar[]
        // ArrayList: Dynamic sized arrays in Java that implement List interface.
        List<Integer> l1 = Arrays.asList(ar4);
        System.out.println("Arrays.asList: " + l1);
        Collections.sort(l1);
        // Creating arraylist from array
        String[] stringArray = { "a", "b", "c", "d", "e", "a" };
        ArrayList<String> arrayList = new ArrayList<String>(Arrays.asList(stringArray));
        System.out.println("Create Array List from Array new ArrayList<String>(Arrays.asList(stringArray)) :"+arrayList);


        ArrayList<Integer> brandNewArrayList = new ArrayList<Integer>(l1);
        brandNewArrayList.add(344);
        System.out.println("Brand New Array List: "+brandNewArrayList);

        //Check if array contains a value
        boolean b = Arrays.asList(stringArray).contains("a");
        System.out.println("Check if array contains x: Arrays.asList(stringArray).contains(\"a\") :"+b);


        // Convert Arrays to Set
        Set<String> newSet = new HashSet<String>(Arrays.asList(stringArray));
        System.out.println("Changing array to set with new HashSet<String>(Arrays.asList(stringArray)): "+newSet);
    }


}
