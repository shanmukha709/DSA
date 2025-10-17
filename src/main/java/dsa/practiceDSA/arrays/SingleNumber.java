package dsa.practiceDSA.arrays;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SingleNumber {
    static int singlenumber(int[] nums){
        int results = 0;
        for (int num : nums){
            results = results ^ num;
        }
        return results;
    }

    static int singlenumber2(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums){
            map.put(num, map.getOrDefault(num,0) + 1);
        }

        for (int num : nums){
            if(map.get(num) == 1){
                return num;
            }
        }
        return -1;
    }

    static int singlenumber3(int[] nums) {
        Set<Integer> set = new HashSet<>();

        int sumunique = 0;
        int sumall = 0;

        for (int num : nums){
            if (set.add(num)){
                sumunique = sumunique + num;
            }
            sumall = sumall + num;
        }

        return 2 * sumunique - sumall;
    }

    public static void main(String[] args) {
        int[] arr = {4,1,2,1,2,};
        System.out.println(singlenumber2(arr));
    }
}
