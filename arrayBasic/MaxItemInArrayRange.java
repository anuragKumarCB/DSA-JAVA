package com.codeBreakdown;

import java.util.*;
public class MaxItemInArrayRange {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] arr = new int[10];

//        input
        for (int i = 0; i < 10; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println(Arrays.toString(arr));
        System.out.println("maximum value in range between index 3-8 "+maxInRange(arr, 3,8));
    }
//    pseudocode for maximum item in array
//    using two pointer method to find maximum
//    lets assume starting element is maximum, and then compare that to elements between staring to ending
//    if first element is maximum then return first element, if not then replace maximum with that element
    static int maxInRange(int[] arr, int start, int end){
        int maxValue = arr[start];
//        edge cases
        if (arr.length == 0){
            return -1;
        }
        for (int i = start; i < end; i++) {
            if (arr[i] > maxValue){
                maxValue = arr[i];
            }
        }
        return maxValue;
    }
}
