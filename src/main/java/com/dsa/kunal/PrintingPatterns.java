package com.dsa.kunal;

public class PrintingPatterns {
    public void pattern1(int n){
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public void pattern2(int n){
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public void pattern3(int n){
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public void pattern4(int n){
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= n-i+1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    public void pattern5(int n){
        for (int i = 1; i <= 2 * n; i++){
            int totalrows = i > n ? 2 * n - i : i;
            for (int j = 1; j <= totalrows; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public void pattern6(int n){
        for (int i = 1; i <= 2 * n; i++){
            int totalcol = i > n ? 2 * n - i : i;
            int spaces = n - totalcol;
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= totalcol; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public void pattern7(int n){
        for (int i = 1; i <= n; i++){
            int spaces = n - i;
            for (int j = 1; j <= spaces; j++) {
                System.out.print("  ");
            }

            for (int k = i; k > 0; k--) {
                System.out.print(k + " ");
            }
            for (int l = 2; l <= i; l++) {
                System.out.print(l + " ");
            }
            System.out.println();
        }
    }


    public void pattern8(int n){
        for (int i = 1; i <= 2 * n; i++){

            int totalcol = i > n ? 2 * n - i : i;

            for (int j = 1; j <= n - totalcol; j++) {
                System.out.print("  ");
            }

            for (int k = totalcol; k > 0; k--) {
                System.out.print(k + " ");
            }
            for (int l = 2; l <= totalcol; l++) {
                System.out.print(l + " ");
            }
            System.out.println();
        }
    }

    public void pattern9(int n){

        n = 2 * n;
        for (int i = 1; i < n ; i++) {
            for (int j = 1; j < n; j++) {
                int index = Math.min(Math.min(i,j),Math.min(n - i, n-j));
                System.out.print(index + " ");
            }
            System.out.println();
        }
    }

    public void recursion(int n){

        if(n > 5){
            return;
        }
        System.out.println(n);
        recursion(n + 1);
    }
    public static void main(String[] args) {
        PrintingPatterns p = new PrintingPatterns();
        p.recursion(1);
    }
}
