package com.codeBreakdown;

import java.util.*;

public class ColmNotFixed {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

//        syntax
        int[][] arr = {
                {1, 2, 3},
                {4, 5},
                {6, 7, 8, 9}
        };
//        output
        for (int[] ints : arr) {
//            how to get when column is not fixed
            for (int anInt : ints) {
//                we have to run for loop for the length of size of every row
//                so that's why using arr[row].length meaning it will run to the size of that row
                System.out.print(anInt + " ");
            }
            System.out.println();
        }

        for (int row = 0; row < arr.length; row++) {
//            how to get when column is not fixed
            for (int col = 0; col < arr[row].length; col++) {
//                we have to run for loop for the length of size of every row
//                so that's why using arr[row].length meaning it will run to the size of that row
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
//            so, arr[row].length can be used in unfixed size of array
//            why not use it in fixed size as-well
        }
    }
}
