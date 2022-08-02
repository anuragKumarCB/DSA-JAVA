package com.codeBreakdown;

import java.util.*;

public class ArraysInFunction {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] arr = new int[5];

        for (int arrElem = 0; arrElem < arr.length; arrElem++){
            arr[arrElem] = in.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        changeArrays(arr);
        System.out.println(Arrays.toString(arr) + " index 3 is changed using another function to the value of 1007");
    }

    static void changeArrays(int[] num) {

        num[3] = 1007;
    }
}
