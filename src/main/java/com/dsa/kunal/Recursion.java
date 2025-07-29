package com.dsa.kunal;

import java.util.Arrays;

public class Recursion {

    static void printnumbersdecending(int n){

        if (n == 0){
            return;
        }
        System.out.println(n);
        printnumbersdecending(n - 1);
    }

    static void printnumbersascending(int n){

        if (n == 0){
            return;
        }
        printnumbersdecending(n - 1);
        
    }

    static int sumofdigits(int n){

        if (n == 0)
            return 0;
        int res = (n % 10);
        return res + sumofdigits(n / 10);
    }

    static int sumofgivennumbers(int n){

        if (n == 0)
            return 0;
        return n + sumofgivennumbers(n - 1);
    }

    static boolean sortedarray(int[] arr, int index){

        if (index == arr.length - 1){
            return true;
        }
        else {
            return arr[index] < arr[index + 1] && sortedarray(arr, index + 1);
        }
    }
    
    static int reverse(int n, int sum){
        
        if (n == 0)
            return sum;
        
        int rem = n % 10;
        sum = sum * 10 + rem;
        return reverse(n / 10, sum);
    }
    
    static boolean palindrome(int n){

        return n == reverse(n, 0);
    }

    static boolean palindromestring(String str, int start, int end){

        if (start >= end){
            return true;
        }
        if (str.charAt(start) != str.charAt(end)){
            return false;
        }

        return palindromestring(str, start+1, end-1);
    }

    static int countnumbers(int n, int count){

        if (n == 0)
            return count;

        int rem = n % 10;

        if (rem == 0){
            return countnumbers(n / 10, count+1);
        }

        return countnumbers(n / 10, count);
    }

    static void pattern(int r, int c){

        if (r == 0){
            return;
        }
        if (c < r){
            pattern(r, c+1);
            System.out.print("*");
        }
        else{
            pattern(r-1, 0);
            System.out.println();
        }
    }

    static void bubblesort(int[] arr, int start, int end) {

        if(end == 0) return;

        if(start < end){
            if (arr[start] > arr[start+1]){
                int temp = arr[start+1];
                arr[start+1] = arr[start];
                arr[start] = temp;
            }
            bubblesort(arr,start+1,end);
        }
        else {
            bubblesort(arr,0,end - 1);
        }
    }


    static void selectionSort(int[] arr, int end, int start, int max) {
        if (end == 0) return;

        if (start <= end) {
            if (arr[start] > arr[max]) {
                selectionSort(arr, end, start + 1, start); // update max
            } else {
                selectionSort(arr, end, start + 1, max);   // continue with current max
            }
        } else
        {
            int temp = arr[max];
            arr[max] = arr[end];
            arr[end] = temp;

            selectionSort(arr, end - 1, 0, 0);
        }
    }

    static int[] mergesort(int[] arr){

        if(arr.length == 1){
            return arr;
        }

        int mid = arr.length / 2;

        int[] left = mergesort(Arrays.copyOfRange(arr,0,mid));
        int[] right = mergesort(Arrays.copyOfRange(arr, mid,arr.length));

        return merge(left, right);
    }

    static int[] merge(int[] first, int[] second){

        int[] mix = new int[first.length + second.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while(i < first.length && j < second.length){

            if (first[i] < second[j]){
                mix[k] = first[i];
                i++;
            }else {
                mix[k] = second[j];
                j++;
            }
            k++;
        }
        while (i < first.length){
            mix[k] = first[i];
            i++;
            k++;
        }
        while (j < second.length){
            mix[k] = second[j];
            j++;
            k++;
        }
        return mix;
    }

    static void mergesortInPlace(int[] arr, int s, int e){

        if(e - s == 1){
            return;
        }

        int mid = (s + e) / 2;

        mergesortInPlace(arr, s, mid);
        mergesortInPlace(arr, mid, e);

        mergeInPlace(arr, s, mid, e);
    }

    static void mergeInPlace(int[] arr, int s,int m, int e){

        int[] mix = new int[e - s];

        int i = s;
        int j = m;
        int k = 0;

        while(i < m && j < e){

            if (arr[i] < arr[j]){
                mix[k] = arr[i];
                i++;
            }else {
                mix[k] = arr[j];
                j++;
            }
            k++;
        }
        while (i < m){
            mix[k] = arr[i];
            i++;
            k++;
        }
        while (j < e){
            mix[k] = arr[j];
            j++;
            k++;
        }

        for (int l = 0; l < mix.length; l++) {
            arr[s+l] = mix[l];
        }
    }

    static void quicksort(int[] arr, int low, int high){

        if (low >= high) return;

        int s = low, e = high, m = s + (e - s) / 2, pivot = arr[m];

        while (s <= e){
            while (arr[s] < pivot) s++;
            while (arr[e] > pivot) e--;

            if (s <= e){
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                e--;
            }
        }
        quicksort(arr,low, e);
        quicksort(arr, s, high);
    }

    public static void main(String[] args) {
//        printnumbersdecending(5);
//        printnumbersascending(5);
//        int[] arr = {1,2,3,4,5,7,8,10,9};
//        System.out.println(sortedarray(arr, 0));
//        System.out.println(sumofdigits(1234));
//        System.out.println(sumofgivennumbers(5));
//        System.out.println(reverse(12345,0));
//        System.out.println(palindrome(1234321));
//        String str = "shahs";
//        System.out.println(palindromestring(str, 0, str.length()-1));
//        System.out.println(countnumbers(302005, 0));
//        pattern(5,0);
        int[] arr = {5,4,7,3,8,1,2};
//        bubblesort(arr,0,arr.length-1);
//        selectionSort(arr,arr.length-1,0, 0);
//        arr = mergesort(arr);
        quicksort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
