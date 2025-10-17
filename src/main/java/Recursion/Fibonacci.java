package Recursion;

public class Fibonacci {

    public int fibo(int n){

        if(n < 2){
            return n;
        }

        return fibo(n-1) + fibo(n - 2);
    }

    public static void main(String[] args) {
        Fibonacci f = new Fibonacci();

        // print fibonacci series till n

        int n = 7;
        for(int i = 0; i < n; i++){
            System.out.print(f.fibo(i) + " ");
        }

        //Print nth fibonacci number
        System.out.println(f.fibo(n));
    }
}
