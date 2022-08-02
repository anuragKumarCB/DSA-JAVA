package com.codeBreakdown;

import java.util.*;
public class ReverseArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int[] arr = new int[10];
        
//        input
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        reverseArray(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void reverseArray(int[]arr){
        int start = 0;
        int end = arr.length-1;

        while (start < end){
//            call swap or just swap
            swapArray(arr, start, end);
            start++;
            end--;
        }
    }
    static void swapArray(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
