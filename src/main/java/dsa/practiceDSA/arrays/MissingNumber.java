package dsa.practiceDSA.arrays;

import java.util.ArrayList;
import java.util.List;

public class MissingNumber {
    static int missingnumber(int[] nums){

        int i = 0;

        while (i < nums.length){

            int correct = nums[i];

            if (nums[i] < nums.length && nums[i] != nums[correct]){
                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
            }else {
                i++;
            }
        }

        int res = 0;
        for (i = 0; i < nums.length; i++) {
            if (nums[i] != i) {
                return i;
            }
        }
        return nums.length;
    }

    public static int missingNumber2(int[] nums) {
        int n = nums.length;
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;

        for (int num : nums) {
            actualSum += num;
        }

        return expectedSum - actualSum;
    }

    public static void main(String[] args) {
        int[] arr = {0,1};
        System.out.println(missingnumber(arr));
    }
}
