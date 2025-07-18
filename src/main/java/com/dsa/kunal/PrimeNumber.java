package com.dsa.kunal;

import java.util.Scanner;

public class PrimeNumber {

    static boolean isPrime(int number){
        for (int i = 2; i < number; i ++){
            if (number % i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println("Enter a number to check  prime or not");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        System.out.println(isPrime(number));
    }
}