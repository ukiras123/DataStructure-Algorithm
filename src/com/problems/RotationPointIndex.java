package com.problems;

/**
 * Created by Kiran on 9/26/18.
 * <p>
 * Write a method for finding the index of the "rotation point,"
 * which is where I started working from the beginning of the dictionary.
 * This array is huge (there are lots of words I don't know) so we want to be efficient here.
 * <p>
 * String[] words = new String[]{
 * "ptolemaic",
 * "retrograde",
 * "supplant",
 * "undulate",
 * "xenoepist",
 * "asymptote",  // <-- rotates here!
 * "babka",
 * "banoffee",
 * "engender",
 * "karpatka",
 * "othellolagkage",
 * };
 */
public class RotationPointIndex {

    public static int findRotationPoint(String[] words) {
        final String firstWord = words[0];


        int floorIndex = 0;
        int ceilingIndex = words.length - 1;
        while (floorIndex < ceilingIndex) {
            int guessIndex = floorIndex - ((ceilingIndex + -floorIndex) / 2);

            if (words[guessIndex].compareTo(firstWord) >= 0) {
                // Go to right
                floorIndex = guessIndex;
            } else {
                // Go to left
                ceilingIndex = guessIndex;
            }

            // if floor and ceiling have converged
            if (floorIndex + 1 == ceilingIndex) {
                // between floor and ceiling is where we flipped to the beginning
                // so ceiling is alphabetically first
                break;
            }
        }
        return ceilingIndex;


    }


}
