package com.dsa.kunal;

import java.util.Scanner;

public class SearchAlgo {

    static int linear(int[] arr, int target){
        int index = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target ){
                index = i;
            }
            else {
                index = -1;
            }
        }
        return index;
    }

    static void evennuminarray(int[] arr3){

        int results = 0;
        for (int i = 0; i < arr3.length; i++){
            int count = 0;
            int num = arr3[i];

            while (num > 0){
                num = num / 10;
                count++;
            }

            if (count % 2 == 0){
                results++;
            }
        }
        System.out.println(results);
    }

    static void linear2(int[][] arr, int target){
        for(int row = 0; row < arr.length; row++){
            for (int col = 0; col < arr[row].length; col++){
                if (arr[row][col] == target){
                    System.out.println(row + " " + col);
                    return;
                }
            }
        }
            System.out.println("not found");
    }

    static void highestsuminarrele(int[][] arr){

        int maxsum = 0;
        int index = 0;

        for(int i = 0; i < arr.length; i++){
            int rowsum = 0;
            for (int j = 0; j < arr[i].length; j++){
                rowsum = rowsum + arr[i][j];
            }

            if (rowsum > maxsum){
                maxsum = rowsum;
                index = i;
            }

        }
        System.out.println("maximum value is " + maxsum + " of index " + index);
    }

    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        System.out.println("Enter arr length ");
        int[][] arr = new int[input.nextInt()][input.nextInt()];
        System.out.println("Enter " + arr.length + " values");
        for(int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                arr[i][j] = input.nextInt();
            }
        }
        input.nextLine();
        highestsuminarrele(arr);
//        System.out.println("enter a number to find");
//        int target = input.nextInt();
//        System.out.println(linear(arr,target));
//        evennuminarray(arr);
//        System.out.println("Enter 2D arr length ");
//        int[][] arr2 = new int[input.nextInt()] [input.nextInt()];
//        System.out.println("Enter " + arr2.length + " values");
//        for(int i = 0; i < arr2.length; i++){
//            for(int j = 0; j < arr2[i].length; j++){
//                arr2[i][j] = input.nextInt();
//            }
//        }
//        input.nextLine();
//        System.out.println("enter a number to find");
//        int target2 = input.nextInt();
//        linear2(arr2, target2);

    }
}
