package com.dsa.kunal;

import java.util.Scanner;

public class ArmStrongNumber {

    static boolean isArmStrong(int num){
        int armstrong = num;
        int results = 0;
        while (num > 0){
            int reminder = num % 10;
            results = results + (reminder * reminder * reminder);
            num = num / 10;
        }
        return results == armstrong;
    }

    static void printArmstrongNumbers() {
        for (int i = 100; i < 1000; i++) {
            if (isArmStrong(i)){
                System.out.println(i);
            }
        }
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number to check armstrong or not");
        int number = input.nextInt();
        System.out.println(isArmStrong(number));
        printArmstrongNumbers();
    }
}
