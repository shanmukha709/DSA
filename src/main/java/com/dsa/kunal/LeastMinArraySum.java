package com.dsa.kunal;

public class LeastMinArraySum {

    static int leastsum(int[] arr1, int m){

        int start = 0;
        int end = 0;

        for(int num : arr1){
            start = Math.max(start, num);
            end = end + num;
        }

        while (start < end){

            int mid = start + (end - start) / 2;
            int sum = 0;
            int pieces = 1;

            for (int nums : arr1){
                if (sum + nums > mid){
                    sum = nums;
                    pieces++;
                }
                else {
                    sum = sum + nums;
                }
            }

            if (pieces > m){
                start = mid + 1;
            }else {
                end = mid;
            }
        }
        return start;
    }

    public static void main(String[] args) {
        int[] arr = {7, 2, 5, 10, 8};
        int m = 2;
        System.out.println(leastsum(arr,m));
    }
}
