package dsa.practiceDSA;

import javax.swing.*;
import java.util.*;

public class Intersection {

    static List<Integer> intersect(int[] nums1, int[] nums2) {

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> intersection = new HashSet<>();

        for(int num : nums1){
            set1.add(num);
        }

        for (int num : nums2){
            if(set1.contains(num)){
                intersection.add(num);
            }
        }

        List<Integer> result = new ArrayList<>();

        result.addAll(intersection);

        return result;
    }

    static int[] intersect2 (int[] num1, int[] num2){

        Map<Integer, Integer> freq = new HashMap<>();

        for (int num : num1){
            freq.put(num, freq.getOrDefault(num,0) + 1);
        }

        List<Integer> ans = new ArrayList<>();

        for (int num : num2){
            if (freq.containsKey(num) && freq.get(num) > 0){
                ans.add(num);
                freq.put(num, freq.get(num) - 1);
            }
        }

        int[] result = new int[ans.size()];

        int i = 0;

        for (int num : ans){
            result[i++] = num;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};

        System.out.println(Arrays.toString(intersect2(nums1, nums2)));

    }
}
