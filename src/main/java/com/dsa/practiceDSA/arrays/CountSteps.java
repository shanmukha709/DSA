package com.dsa.practiceDSA.arrays;

import java.util.*;

public class CountSteps {

    static int countsteps(int n, int count){


        if (n == 0){
            return count;
        }
        else if (n % 2 == 0){
            return countsteps(n / 10, count+1);
        }
        else {
            return countsteps(n - 1, count+1);
        }
    }

    public static List<Integer> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();

        for (int row = 0; row < numRows; row++) {
            List<Integer> current = new ArrayList<>();

            for (int col = 0; col <= row; col++) {
                // First and last elements are always 1
                if (col == 0 || col == row) {
                    current.add(1);
                } else {
                    // Middle elements are sum of two numbers from previous row
                    int val = triangle.get(row - 1).get(col - 1) + triangle.get(row - 1).get(col);
                    current.add(val);
                }
            }

            triangle.add(current);
        }
        return triangle.get(numRows - 1);
    }

    public static void main(String[] args) {
//        System.out.println(countsteps(27,0));
        ArrayList<Integer> ans = (ArrayList<Integer>) generate(5);
        System.out.println(ans);
    }
}
