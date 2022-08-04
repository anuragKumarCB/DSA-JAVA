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
//    pseudocode for reversing array
//    for that lets start with first element and last element and reverse them using swap function.
//    then move to second element and second-last element and reverse them.
//    by swapping start element with end element and moving up and down one element each time we can reverse array.
//    for that loop condition should be start should not be greater than end, so it will not reach to end element.
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
