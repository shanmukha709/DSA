package dsa.practiceDSA.arrays;

import java.util.HashSet;
import java.util.Set;

public class containsDuplicate {
    static boolean containsDuplicate(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        boolean status =  false;
        for(int num : nums){
            if(!seen.add(num)){
                status = true;
                break;
            }
        }
        return status;
    }

    public static void main(String[] args) {
        int[] votes = {1,2,3,3};
        System.out.println(containsDuplicate(votes));
    }
}
