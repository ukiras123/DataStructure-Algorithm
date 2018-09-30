package com.problems.interesting;

/**
 * Created by Kiran on 9/15/18.
 */
public class SubStringIndex {


    public static int subStringIndex(String mainStr, String subStr){
        int subLength = subStr.length();
        int mainLength = mainStr.length();

        int j =0;
        // applapple
        // apple
        if(subLength <= mainLength){
            for(int i = 0; i< mainLength; i++){
                if (mainStr.charAt(i) == subStr.charAt(j)) {
                    System.out.println("matched: "+ i+" "+j+" "+ subStr.charAt(j));
                    j++;
                    if (j == subLength)
                    {
                        return i - subLength + 1;
                    }
                }
                else {
                    i = i - 1;
                    j = 0;
                }
            }
        }
        return -1;
    }


    public static int subStringIndexCopied(String str, String substr) {
        int substrlen = substr.length();
        int strlen = str.length();
        int j = 0;

        if (substrlen >= 1) {
            for (int i = 0; i < strlen; i++) {              // iterate through main string
                if (str.charAt(i) == substr.charAt(j)) {    // check substring
                    j++;                                    // iterate
                    if (j == substrlen) {                   // when to stop
                        return i - substrlen +1; //found substring. As i is currently at the end of our substr so sub substrlen
                    }
                }
                else {
                    i = i -1;
                    j = 0;
                }
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        String mainString = "applapple";
        String subString = "apple";
        System.out.println(subStringIndex(mainString,subString));
        System.out.println(subStringIndexCopied(mainString,subString));
        System.out.println(mainString.indexOf(subString));
    }
}


