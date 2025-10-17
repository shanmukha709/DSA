package dsa.practiceDSA.arrays;

import java.util.Set;
import java.util.TreeSet;

public class ThirdMaximumNumber {
    static int thirdMax(int[] nums) {
        TreeSet<Integer> insert = new TreeSet<>();

        for(int num : nums){
            insert.add(num);

            if (insert.size() > 3){
                insert.pollFirst();
            }
        }
        if (insert.size() < 3){
            return insert.last();
        }
        else {
            return insert.first();
        }

    }

    static int thirdMax2(int[] nums) {

        Long first = null, second = null, third = null;

        for (int num : nums){
            if ((first != null && num == first ||
            second != null && num == second ||
            third != null && num == third)){
                continue;
            }
            if (first == null || num > first){
                third = second;
                second = first;
                first = (long) num;
            }
            else if (second == null || num > second) {
                third = second;
                second = (long) num;
            }
            else if (third == null || num > third){
                third = (long) num;
            }
        }

        return (third == null) ? first.intValue() : third.intValue();
    }

    public static void main(String[] args) {
        int[] arr = {2,2,3,1};
        System.out.println(thirdMax2(arr));
    }

}
