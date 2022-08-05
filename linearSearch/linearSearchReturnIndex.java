package com.codeBreakdown;

import java.util.*;
public class LinearSearchReturnIndex {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[10];
//        input
        System.out.println("input 10 integer elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println("enter the target element");
        int target  = in.nextInt();
        System.out.println("index "+linearSearch(arr,target));
    }

//    search in array : return the index if item/target found
//    if, not found return -1
    static int linearSearch(int[] arr,int target){
//        edge-cases
        if (arr.length == 0){
            return -1;
        }
//        running a for loop for checking target
        for (int index = 0; index < arr.length; index++) {
//            check for every element at every index, if it is = target, then return index
//            another way you can do is assign a variable for index
//            int element = arr[index]
//            if (element == target){
            if (arr[index] == target){
                return index;
            }
        }
//        this return statement will only execute when none of above return statements have executed
//        meaning item/target not found
        return -1;
    }
//
}
