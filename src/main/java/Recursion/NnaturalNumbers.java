package Recursion;

public class NnaturalNumbers {

    static void funtilln(int n){

        if (n == 0){
            return;
        }

        funtilln(n - 1);
        System.out.print(n + " ");
    }

    static void funtillnreverse(int n){

        if (n == 0){
            return;
        }

        System.out.print(n + " ");
        funtillnreverse(n - 1);
    }

    public static void main(String[] args) {
//        funtilln(5);
//        System.out.println();
        funtillnreverse(5);
    }
}
