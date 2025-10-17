package dsa.kunal;

import java.util.Arrays;
import java.util.Scanner;

public class BinerySearch {

    static int search1(int[] arr, int target){

        int start = 0;
        int end = arr.length-1;

        while (start <= end){
            int mid = (start + end) / 2;

            if (target < arr[mid]){
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }

    static int ceiling(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        if (target > arr[arr.length-1]){
            return -1;
        }
        while (start <= end) {
            int mid = (start + end) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid; // Exact match is the ceiling
            }
        }
        return start;
    }

    static int flooring(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        if (target < arr[0]){
            return -1;
        }
        while (start <= end) {
            int mid = (start + end) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return end;
    }

    static char smallgreaterletter(char[] arr, char target){
        int start = 0;
        int end = arr.length-1;

        while (start <= end){
            int mid = (start + end) / 2;

            if (target < arr[mid]){
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return arr[start % arr.length];
    }

    static int[] callingtobelowmethod(int[] arr, int target){
        int[] ans =  {-1, -1};

        ans[0] = firstAndLastOccurence(arr,target,true);
        if (ans[0] != -1){
            ans[1] = firstAndLastOccurence(arr,target,false);
        }

        return ans;
    }
    static int firstAndLastOccurence(int[] arr, int target, boolean findindex){
        int start = 0;
        int end = arr.length-1;
        int ans = -1;

        while (start <= end){
            int mid = (start + end) / 2;

            if (target < arr[mid]){
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            }
            else {
                ans = mid;
                if (findindex){
                    end = mid - 1;
                }
                else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }

    static int findValueInInfinitAarray(int[] arr, int target){

        int start = 0;
        int end = 1;

        while(end < arr.length && target > arr[end]){
            int temp = end + 1;
            end = end +(end - start + 1) * 2;
            start = temp;
        }

        end = Math.min(end, arr.length - 1);

        while (start <= end) {
            int mid = (start + end) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    static void BinarySearchExample() {

        int[] sortedArray = {10, 20, 30, 40, 50};
        int target = 30;
        int index = Arrays.binarySearch(sortedArray, target);
        if (index >= 0) {
           System.out.println("Element found at index: " + index);
        } else {
           System.out.println("Element not found.");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        System.out.println("Enter array length");
//        int[] arr = new int [input.nextInt()];
//        System.out.println("Enter array values " + arr.length);
//        for (int i = 0; i < arr.length; i++){
//            arr[i] = input.nextInt();
//        }
//        System.out.println("enter value to find");
//        int target = input.nextInt();
        int[] arr = {12, 13, 14, 14, 14, 17, 21, 28, 32, 45, 49, 52, 64, 67, 78, 83, 91};
//        int target = input.nextInt();

        //        System.out.println(search1(arr, target));
//        System.out.println(flooring(arr, target));
//        char target = input.next().charAt(0);
//        char[] arr = {'b','f','h','k','o'};
//        System.out.println(smallgreaterletter(arr,target));
//        System.out.println(Arrays.toString(callingtobelowmethod(arr, target)));
//        System.out.println(findValueInInfinitAarray(arr,target));
        BinarySearchExample();
    }
}
