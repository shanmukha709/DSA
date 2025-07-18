package com.dsa.kunal;

import java.util.Arrays;

public class FindValueInMatrix {

    static int[] findinmatrix(int[][] matix, int target){

        int row = 0;
        int col = matix[0].length - 1;

        while (row < matix.length && col >= 0){

            if(target == matix[row][col]){
                return new int[]{row,col};
            }

            if (target < matix[row][col]){
                col--;
            }
            else {
                row++;
            }
        }
        return new int[]{-1, -1};
    }

    static int[] binerysearch(int[][] matrix, int row, int cstart, int cend, int target){

        while(cstart <= cend){
            int mid = cstart + (cend - cstart) / 2;

            if (matrix[row][mid] == target){
                return new int[]{row, mid};
            }
            if (matrix[row][mid] < target){
                cstart = mid + 1;
            }
            else {
                cend = mid -1;
            }
        }
        return new int[]{-1, -1};
    }

    static int[] sortedmatrix(int[][] matrix, int  target) {

        int rows = matrix.length;
        int cols = matrix[0].length;

        if (cols == 0) {
            return new int[]{-1, -1};
        }
        if (rows == 1) {
            return binerysearch(matrix, 0, 0, cols - 1, target);
        }

        int rstart = 0;
        int rend = rows - 1;
        int cmid = cols / 2;

        while (rstart < (rend - 1)) {

            int mid = rstart + (rend - rstart) / 2;

            if (matrix[mid][cmid] == target) {
                return new int[]{mid, cmid};
            }
            if (matrix[mid][cmid] < target) {
                rstart = mid;
            } else {
                rend = mid;
            }
        }

        if (matrix[rstart][cmid] == target) {
            return new int[]{rstart, cmid};
        }
        if (matrix[rstart + 1][cmid] == target) {
            return new int[]{rstart + 1, cmid};
        }
        if (target <= matrix[rstart][cmid - 1]) {
            return binerysearch(matrix, rstart, 0, cmid - 1, target);
        }
        if (target >= matrix[rstart][cmid + 1] && target <= matrix[rstart][cols - 1]) {
            return binerysearch(matrix, rstart, cmid + 1, cols - 1, target);
        }
        if (target <= matrix[rstart + 1][cmid - 1]) {
            return binerysearch(matrix, rstart + 1, 0, cmid - 1, target);
        }
        else {
            return binerysearch(matrix, rstart + 1, cmid + 1, cols - 1, target);
        }

    }

    public static void main(String[] args) {
//        int[][] matrix = {
//                {10, 20, 30, 40},
//                {15, 25, 35, 45},
//                {28, 29, 37, 49},
//                {33, 34, 38, 50}
//        };

        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };
        int target = 11;

//        System.out.println(Arrays.toString(findinmatrix(matrix,target)));
        System.out.println(Arrays.toString(sortedmatrix(matrix,11)));
    }
}
