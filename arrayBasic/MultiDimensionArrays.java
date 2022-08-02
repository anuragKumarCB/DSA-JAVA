package com.codeBreakdown;

import java.util.*;
public class MultiDimensionArrays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

//        you can think multidimensional array as an array of array meaning every single element in that array is array itself
        
//        multidimensional array declaration
//        syntax
//        datatype[][] arr = new(new is used for creating objects in JAVA) datatype  [row //adding the row is mandatory]   [column //
//        input
//        directly for example
//        int[][] arr= {
//                {1, 2, 3},
//                {4, 5, 6},
//                {7, 8, 9}
//        };
        int[][] arr = new int[3][3];

//        input
//        using for loop
        for (int row = 0; row < arr.length; row++) { //for every row in that array
//            for every column in that array
            for (int colm = 0; colm < arr[row].length; colm++) {
                arr[row][colm] = in.nextInt();
            }
        }

        //        output using enhanced for loop
        for (int[] element : arr) { //for every element in that array print that array.
            // in 2D array element of array is array itself so passing array in datatype
            System.out.println(Arrays.toString(element));
        }
//        output normal for loop
//        for (int row = 0; row < arr.length; row++) {
//            for (int colm = 0; colm < arr[row].length; colm++) {
//                System.out.print(arr[row][colm]+" ");
//            }
//            System.out.println();
//
//        }
//        output
//        for (int row = 0; row < arr.length; row++) {
//            System.out.println(Arrays.toString(arr[row]));
//        }


    }
}
