package com.codeBreakdown;

import java.util.*;
public class ArrayListExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

//        syntax
//        ArrayList<datatype wrapper> arrayListName = new ArrayList<>(initialCapacity/size);
        ArrayList<Integer> list = new ArrayList<>(5);
//        list.add(645);
//        list.add(2145);
//        list.add(124);
//        list.add(5647);
//        list.add(23546);
//        list.add(154);
//        list.add(457);
//        System.out.println(list);
//        System.out.println(list.contains(457));
//        list.set(0, 999);
//        System.out.println(list);
//        int indx = list.get(2);
//        list.remove(2);
//        System.out.println(list +" index 2 , element value" + indx + " has been remove");


//        input
        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }
        //        output
        for (int i = 0; i < 5; i++) {
            System.out.print(list.get(i)+ " ");
        }
//        output
//        System.out.println(list);     //you can directly print the ArrayList
        int ind = list.get(2);
        System.out.println(ind);


    }
}
