package com.codeBreakdown;

import java.lang.reflect.Array;
import java.util.*;
//import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        single dimensional array

        Scanner in = new Scanner(System.in);
//        syntax for array declaration
//        datatype[] arrayName = new datatype[size];
//        datatype + [] variable name = {array elements} //directly putting element value

        int[] arr = new int[5];
        String[] arrStr = new String[5];

//        input
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
//        output
//        enhanced for loop syntax
//        for(datatype element : arrName) { for each element of that array print that array
//            System.out.println(element); here element represent Element of array
//        }
        for (int element : arr){
            System.out.print(element + " ");
        }

        System.out.println();

//        or you can directly print using Arrays.toString(); method
//        output Arrays.toString()
        System.out.println(Arrays.toString(arr));
//        output
//        normal way of doing it  with for loop
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i]+" ");
//        }

//
    }
}
