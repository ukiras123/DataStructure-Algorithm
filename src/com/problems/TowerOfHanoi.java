package com.problems;

/**
 * Created by Kiran on 9/30/18.
 */
public class TowerOfHanoi {


    public static void towerOfHanoi(int n, char from_rod, char to_rod, char aux_rod) {

        if (n == 1) {
            System.out.println("*Moving disk 1 from rod " + from_rod + " to rod " + to_rod);
            return;
        }
        towerOfHanoi(n - 1, from_rod, aux_rod, to_rod);
        System.out.println("Moving disk " + n + " from rod " + from_rod + " to rod " + to_rod);
        towerOfHanoi(n-1, aux_rod, to_rod, from_rod);
    }


    public static void main(String[] args) {
        int n = 4; // Number of Discs
        towerOfHanoi(n, 'A', 'B', 'C');  // A, B, C are rod name
    }

}





