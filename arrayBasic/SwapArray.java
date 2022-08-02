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
    static void swapArray(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
