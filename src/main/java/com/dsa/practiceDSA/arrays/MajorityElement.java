package com.dsa.practiceDSA.arrays;

public class MajorityElement{

    static int majorityelement(int[] arr){
        int count = 0;
        int candidate = 0;

        for(int num : arr){
            if(count == 0){
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }
        return candidate;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,2,2,1,1,1,2,2};
        System.out.println(majorityelement(arr));
    }
}
