package dsa.tap;

import static java.lang.Math.sqrt;

public class Factorial {

    static int factorialofgiven(int n){

        int res = 1;

        for (int i = 1; i <= n; i++) {

            res = res * i;
        }
        return res;
    }

    static int factorialforgiven(int n){
        int res = 1;

        while(n > 0){
            int reminder = n % 10;
            res = res * reminder;
            n = n / 10;
        }
        return res;
    }

    static int countthenumber(int n){
        int count = 0;

        while(n > 0){
            n = n / 10;
            count++;
        }
        return count;
    }

    static int nooftrailingzeros(int n){

        int res = 0;
        int powerof5 = 5;

        while(n >= powerof5){

            res = res + (n / powerof5);
            powerof5 = powerof5 * 5;
        }
        return res;
    }

    static int GCD(int a, int b){

        while(a != 0 && b != 0){
            if (a > b){
                a = a % b;
            }
            else {
                b = b % a;
            }
        }

        if (a != 0){
            return a;
        }
        else {
            return b;
        }
    }

    static int LCM(int a, int b){
            return (a*b)/GCD(a,b);
    }

    static  boolean checkprime(int n){

        if (n == 1){
            return false;
        }
        if (n == 2 || n == 3){
            return true;
        }
        if (n % 2 == 0 || n % 3 == 0){
            return false;
        }

        for (int i = 5; i * i <= n; i = i + 6) {
            if (n % i == 0 || n % (i+2) == 0){
                return false;
            }
        }
        return true;
    }

    static void allprimenumbers(int n){
        boolean[] prime = new boolean[n + 1];

        for (int i = 2; i*i <= n; i++){
            if (!prime[i]){
                for (int j = i * i; j <= n ; j = j + i) {
                    prime[j] = true;
                }
            }
        }

        for (int i = 1; i <= n; i++) {
            if(!prime[i]){
                System.out.print(i + " ");
            }
        }
    }

    static void alldivisorsofgivennumber(int n){

        int i = 0;

        for (i = 1; i*i <= n ; i++) {
            if(n % i == 0){
                System.out.println(i);
            }
        }
        for (; i > 0; i--) {
            if (n % i == 0 && i != n/i) {
                System.out.println(n / i);
            }
        }
    }

    static void allprimefactors(int n){

        for (int i = 2; i*i <= n ; i++) {
            while(n % i == 0){
                System.out.println(i);
                n = n / i;
            }
        }

        if (n > 1) {
            System.out.println(n);
        }

    }

    public static void main(String[] args) {
//        System.out.println(factorialofgiven(5));
//        System.out.println(LCM(12,18));
//        System.out.println(checkprime(42));
//        allprimenumbers(20);
//        alldivisorsofgivennumber(40);
//        allprimefactors(40);
        System.out.println(sqrt(40));
    }
}
