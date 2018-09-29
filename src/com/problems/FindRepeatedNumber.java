package com.problems;

/**
 * Created by Kiran on 9/27/18.
 */
public class FindRepeatedNumber {

    public static int findRepeat(int[] numbers) {

        if (numbers.length < 2) {
            throw new IllegalArgumentException("Finding duplicate requires at least two numbers");
        }

        int n = numbers.length - 1;

        int sumWithoutDuplicate = (n * n + n) / 2;

        int actualSum = 0;
        for (int number : numbers) {
            actualSum += number;
        }

        return actualSum - sumWithoutDuplicate;
    }

    public static void main(String[] args) {

    }
}
