package com.dsa.kunal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortingMethods{

    static void bubblesort(int[] arr){

        boolean swapped;

        for (int i = 0; i < arr.length-1; i++) {
            swapped = false;
            for(int j = 1; j < arr.length - i; j++){

                if(arr[j] < arr[j - 1]){
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j-1] = temp;
                    swapped = true;
                }

            }
            if (!swapped){
                break;
            }

        }
        System.out.println(Arrays.toString(arr));
    }

    static void selectionsort(int[] arr){

        for (int i = 0; i < arr.length; i++){
           int last = arr.length-i-1;
            int max = maxindex(arr,0,last);
            swap(arr,max,last);
        }
    }
    static void swap(int[] arr,int max, int end){
        int temp = arr[end];

        arr[end] = arr[max];
        arr[max] = temp;
    }
    static int
    maxindex(int[] arr, int start, int end){
        int max = start;
        for(int i = start; i <= end; i++){
            if (arr[max] < arr[i]){
                max = i;
            }
        }
        return max;
    }

    static void insertionsort(int[] arr){

        for (int i = 0; i < arr.length -1; i++) {
            for (int j = i+1; j > 0; j--) {
                if(arr[j] < arr[j-1]){
                    swap(arr,j,j-1);
                }
                else {
                    break;
                }
            }
        }
    }

    static void cyclesort(int[] arr){

        int i = 0;

        while (i < arr.length) {

            int correct = arr[i] - 1;

            if (arr[i] != arr[correct]){
                swap(arr,i,correct);
            }else {
                i++;
            }
        }
    }

    static List<Integer> cyclesortfinding(int[] arr){

        int i = 0;

        while (i < arr.length) {

            int correct = arr[i] - 1;

            if (arr[i] < arr.length && arr[i] != arr[correct]){
                swap(arr,i,correct);
            }else {
                i++;
            }
        }

        List<Integer> result = new ArrayList<>();

        for (int j = 0; j < arr.length; j++) {

            if (arr[j] != j+1){
                result.add(j+1);
            }
        }
        return result;
    }

    static void quicksort(int[] arr, int low, int high){
        if (low < high){
            int pivot = pivotindex(arr,low,high);
            quicksort(arr,low,pivot-1);
            quicksort(arr,pivot+1,high);
        }
    }

    static int pivotindex(int[] arr, int low, int high){

        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {

            if (arr[j] < pivot){
                i++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }

        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    public static void main(String[] args) {
        int[] arr = {5,2,7,1,4,7,3};
//        List<Integer> arr1 = cyclesortfinding(arr);
        quicksort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
//        cyclesort(arr);
//        System.out.println(Arrays.toString(arr));
//        quicksort(arr,0,arr.length-1);
//        System.out.println(Arrays.toString(arr));
    }
}
