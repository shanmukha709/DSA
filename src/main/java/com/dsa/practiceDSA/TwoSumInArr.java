package com.dsa.practiceDSA;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumInArr {

    static int[] twosum(int[] arr, int target){

        Map<Integer,Integer> nums = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {

            int tofind = target - arr[i];

            if (nums.containsKey(tofind)){

                return new int[] {nums.get(tofind), i};
            }

            nums.put(arr[i], i);
        }
        throw new IllegalArgumentException("No two some found");
    }

    public static void main(String[] args) {
        int[] arr = {5,5,6,2,9,8,7};
        int target = 98;

        try{
            int[] result = twosum(arr,target);
            System.out.println(Arrays.toString(result));
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
