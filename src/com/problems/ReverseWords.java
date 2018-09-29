package com.problems;

/**
 * Created by Kiran on 9/26/18.
 * <p>
 * <p>
 * char[] message = { 'c', 'a', 'k', 'e', ' ',
 * 'p', 'o', 'u', 'n', 'd', ' ',
 * 's', 't', 'e', 'a', 'l' };
 * <p>
 * reverseWords(message);
 * <p>
 * System.out.println(message);
 * // prints: "steal pound cake"
 */
public class ReverseWords {

    static void reverseWords(char[] message){
        reverseCharacters(message, 0, message.length - 1);

        int currentStartIndex = 0;
        for (int i =0; i <=  message.length; i++){
            if (i == message.length || message[i] == ' '){
                reverseCharacters(message, currentStartIndex, i-1);
                currentStartIndex = i + 1;
            }
        }

    }

    public static void reverseCharacters(char[] message, int leftIndex, int rightIndex) {

        // walk towards the middle, from both sides
        while (leftIndex < rightIndex) {

            // swap the left char and right char
            char temp = message[leftIndex];
            message[leftIndex] = message[rightIndex];
            message[rightIndex] = temp;
            leftIndex++;
            rightIndex--;

        }
    }

    public static void main(String[] args) {
        char[] message = { 'c', 'a', 'k', 'e', ' ',
                'p', 'o', 'u', 'n', 'd', ' ',
                's', 't', 'e', 'a', 'l' };
        reverseWords(message);
        System.out.println(message);
    }
}
