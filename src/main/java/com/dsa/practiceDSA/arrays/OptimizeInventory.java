package com.dsa.practiceDSA.arrays;

import java.util.*;

public class OptimizeInventory {

    static int optimize(List<Integer> inventoryAdjustments){

        inventoryAdjustments.sort(Collections.reverseOrder());

        PriorityQueue<Integer> included = new PriorityQueue<>();

        long sum = 0L;
        int count = 0;

        for(int v : inventoryAdjustments){
            sum = sum + v;
            included.offer(v);
            count++;

            if (sum <= 0){
                int worst = included.poll();
                sum = sum - worst;
                count--;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        List<Integer> a1 = Arrays.asList(3,-5,8,-9,-7);
        List<Integer> a2 = Arrays.asList(-1,-3,-2,0);
        System.out.println(optimize(new ArrayList<>(a1)));
    }
}
