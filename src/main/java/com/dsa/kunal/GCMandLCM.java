package com.dsa.kunal;

public class GCMandLCM {

    static int gcd(int a, int b) {

        if (a == 0) {
            return b;
        }
        return gcd(b % a, a);
    }

    public static void main(String[] args) {
        System.out.println(gcd(80,120));
    }
}