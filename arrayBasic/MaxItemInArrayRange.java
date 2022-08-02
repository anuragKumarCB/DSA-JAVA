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
        System.out.println("maximum value in range between index 3-8 "+maxInRange(arr, 3,8)); //you can change index here
    }
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
