// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/

import java.util.*;
public class NumbersWithEvenNumberOfDigit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[6];

//        input
        System.out.println("enter numbers");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
//        System.out.println(Arrays.toString(arr));
        System.out.println(findNumbers(arr));
    }
    static int findNumbers(int[] nums){
        int count = 0;
        for (int num : nums){
            if (even(num)){
                count++;
            }
        }
        return count;
    }
//    function to check if the number contains even number of digit or not
    static boolean even(int num) {
        int numberOfDigits = digits2(num);
        return numberOfDigits % 2 == 0;
//        if (numberOfDigits % 2 == 0){
//            return true;
//        }
//        return false;
    }
//    count number of digit in number using math.log
    static int digits2(int num){
        if (num < 0){
            num = num * -1;
        }
        if (num == 0){
            return 1;
        }
        return (int)(Math.log10(num)) + 1;
    }
//    count number of digit in number
//    static int digits(int num){
//        if (num < 0){
//            num = num * -1;
//        }
//        if (num == 0){
//            return 1;
//        }
//        int count = 0;
//
//        while (num > 0){
//            count++;
//            num = num / 10; //num /= 10;
//        }
//
//        return count;
//    }
}
