package com.dsa.practiceDSA.arrays;

import java.util.ArrayList;
import java.util.List;

public class PascalsTraingle {
    static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            List<Integer> current = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i){
                    current.add(1);
                }
                else{
                    int val = triangle.get(i - 1).get(j - 1) + triangle.get(i - 1).get(j);
                    current.add(val);
                }
            }
            triangle.add(current);
        }
        return triangle;
    }

    static List<Integer> generate2(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();

        for (int i = 0; i <= numRows; i++) {
            List<Integer> current = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i){
                    current.add(1);
                }
                else{
                    int val = triangle.get(i - 1).get(j - 1) + triangle.get(i - 1).get(j);
                    current.add(val);
                }
            }
            triangle.add(current);
        }
        return triangle.get(numRows);
    }

    static List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>();
        row.add(1);  // first row is always [1]

        for (int i = 1; i <= rowIndex; i++) {
            // update in reverse to avoid overwriting needed values
            for (int j = row.size() - 1; j >= 1; j--) {
                row.set(j, row.get(j) + row.get(j - 1));
            }
            row.add(1);
        }

        return row;
    }
    public static void main(String[] args) {
        List<Integer> ans = getRow(4);
        System.out.println(ans);
    }
}
