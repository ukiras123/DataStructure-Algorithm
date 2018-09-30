package com.problems;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by Kiran on 9/12/18.
 * <p>
 * The shuffle must be "uniform," meaning each item in the original array must have the same probability of ending up in each spot in the final array.
 * <p>
 * Assume that you have a method getRandom(floor, ceiling) for getting a random integer that is >= floor and <= ceiling.
 */
public class ShuffleArray {

    public static void shuffleArray(int[] numbers){

        if (numbers == null){
            throw new IllegalArgumentException("Please pass Valid Numbers");
        }

        if (numbers.length <=1 ){
            return;
        }

       int arraySize = numbers.length-1;
        for (int i =0; i <= arraySize; i++){
            int randomNum = getRandom(i,arraySize);
            if (randomNum != i) {
                int temp = numbers[randomNum];
                numbers[randomNum] = numbers[i];
                numbers[i] = temp;
            }
        }
    }

    private static Random rand = new Random();

    private static int getRandom(int floor, int ceiling) {
        return rand.nextInt((ceiling - floor) + 1) + floor;
    }


    public static void main(String[] args) {
        int[] numb = new int[]{1,2,3,4,5,6,7,8,9};
        shuffleArray(null);
        System.out.println(Arrays.toString(numb));
    }
}
