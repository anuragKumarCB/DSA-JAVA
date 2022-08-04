package com.codeBreakdown;

import java.util.*;
public class MultiDimenArrayList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

//        syntax
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
//        initialization (size)     //meaning how much ArrayList/row it contains
        for (int i = 0; i < 4; i++) {
            list.add(new ArrayList<>());
        }
        
//        input
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                list.get(i).add(in.nextInt());      //to get address of the ArrayList use .get() method

            }
        }
        System.out.println(list);
    }
}
