package Recursion;

public class FactorialandSum {

    static int factorial(int n){

        if(n == 1){
            return 1;
        }

        return n * factorial(n - 1);
    }

    static int sum(int n){
        if(n == 1){
            return 1;
        }

        return n + sum(n - 1);
    }

    static int sumOfDigits(int n){

        if(n == 0){
            return 0;
        }

        return (n % 10) + sumOfDigits( n / 10);
    }

    static int prodOfDigits(int n){

        if(n == 0){
            return 1;
        }

        return (n % 10) * prodOfDigits( n / 10);
    }

    public static void main(String[] args) {

        System.out.println(factorial(4));
        System.out.println(sum(5));
        System.out.println(sumOfDigits(12304));
        System.out.println(prodOfDigits(44));
    }
}
