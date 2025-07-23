package com.dsa.practiceDSA;

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

    public static void main(String[] args) {
        System.out.println(countsteps(27,0));
    }
}
