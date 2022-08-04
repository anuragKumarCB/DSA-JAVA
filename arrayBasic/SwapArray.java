package com.codeBreakdown;

import java.util.*;
public class SwapArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[6];

//        input
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        swapArray(arr, 1,5);
        System.out.println("After swap");
        System.out.println(Arrays.toString(arr));
    }
//    pseudocode for swap
//    save value of first one to a temporary one then change that save the value of second
//    one to first one and then save the value of temporary one to second one.

//    swap work the same. it's just, to swap an array you have to swap its index.
//    Java already provide us with temp that can be used to store temporary value.
//    so using temp and creating a function for it.
    static void swapArray(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
