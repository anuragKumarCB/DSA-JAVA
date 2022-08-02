package com.codeBreakdown;

import java.util.Arrays;
import java.util.Scanner;

public class MaximumItemInArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[6];

//        input
        for (int i = 0; i < 6; i++) {
            arr[i]= in.nextInt();
        }

        System.out.println(Arrays.toString(arr));
        System.out.println("maximum value in array " +maximumInArray(arr));
    }
    static int maximumInArray(int[] arr){
        if(arr.length == 0){
            return -1;
        }
        int maxValue = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxValue){
                maxValue = arr[i];
            }
        }
        return maxValue;
    }
}
