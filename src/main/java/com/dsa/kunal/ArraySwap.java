package com.dsa.kunal;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySwap {

    static void  swap(int[] arr, int index1, int index2) {
        int temp  = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    static  int maxvlaue (int[] arr){
        int max = arr[0];

        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

    public void reverse(int[] arr, int start, int end){
        while (start <= end){
            swap(arr, start, end);
            start++;
            end--;
        }
        System.out.println("Reversed array " + Arrays.toString(arr));
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("please enter array length");
        int[] arr = new int[input.nextInt()];
        System.out.println("Enter " + arr.length + " values");
        for(int i = 0; i < arr.length; i++){
             arr[i] = input.nextInt();
        }

        swap(arr, 1, 4);
        System.out.println("Swapped array " +Arrays.toString(arr));

        System.out.println("Maxium value of array " + maxvlaue(arr));

        ArraySwap as = new ArraySwap();
        as.reverse(arr, 0, arr.length-1);


    }
}
