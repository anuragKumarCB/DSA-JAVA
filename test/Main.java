package com.codeBreakdown;

// only import the java util you need
// import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("your name please");
        String name = sc.next();
        System.out.println("hello there "+ name + " welcome to programming world.");
    }
}
