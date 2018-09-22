package com.datastructure.array;

/**
 * Created by Kiran on 9/20/18.
 */
public class MultiDimentionArray {

    public static void main(String[] args) {
        int[] array1 = new int[5]; // Aray of size 5
        int[] array2 = {1, 2, 3, 4, 5}; // Array of size 5
        boolean[] boolArray = new boolean[2];
        char[] charArray = {'a', 'v', 'c'};
        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }


        // Array as class object
        // declares an Array of integers.
        Student[] arr;

        // allocating memory for 5 objects of type Student.
        arr = new Student[5];

        // initialize the first elements of the array
        arr[0] = new Student(1,"aman");

        // initialize the second elements of the array
        arr[1] = new Student(2,"vaibhav");

        // so on...
        arr[2] = new Student(3,"shikar");
        arr[3] = new Student(4,"dharmesh");
        arr[4] = new Student(5,"mohit");

        // accessing the elements of the specified array
        for (int i = 0; i < arr.length; i++)
            System.out.println("Element at " + i + " : " +
                    arr[i].roll_no +" "+ arr[i].name);





        // Multi Dimention Array

        int[][] int2Array = new int[10][20]; //a 2D array or matrix
        int[][][] int3Array = new int[10][20][10]; //a 3D array

        int multiArr[][] = { {2,7,9},{3,6,1},{7,4,2} };


        // printing 2D array
        for (int i=0; i< 3 ; i++)
        {
            for (int j=0; j < 3 ; j++)
                System.out.print(multiArr[i][j] + " ");

            System.out.println();
        }

    }
}


// Java program to illustrate creating an array of
// objects
class Student
{
    public int roll_no;
    public String name;
    Student(int roll_no, String name)
    {
        this.roll_no = roll_no;
        this.name = name;
    }
}

