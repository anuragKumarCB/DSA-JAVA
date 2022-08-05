package com.codeBreakdown;

import java.util.*;
public class LinearSearchReturnElement {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] nums = new int[10];

//        input
        System.out.println("input 10 integer elements");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = in.nextInt();
        }
        System.out.println("enter the target element");
        int target = in.nextInt();
        System.out.println(linearSearch(nums,target));
    }

//    search in array : return the element if item/target found
//    if, not found return Integer.Max_Value because -1 can be an element
    static int linearSearch(int[] arr, int target){
//        edge-cases
        if (arr.length == 0){
            return Integer.MAX_VALUE;
//        instead of retuning -1, returning Integer.Max_Value because -1 can be an element

        }
//        foreach loop because it's iterating over every element not the index
        for (int element : arr) {   //for each element in array
            if (element == target){     //check if element = target, if yes then return the element
                return element;
            }
        }
//        this statement will only execute when none of above return statement have executed
//        meaning item/target not found
        return Integer.MAX_VALUE;
//        instead of retuning -1, returning Integer.Max_Value because -1 can be an element
    }
}
