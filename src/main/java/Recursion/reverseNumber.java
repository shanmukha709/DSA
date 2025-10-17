package Recursion;

public class reverseNumber {

    static int reverse(int n, int reverse){

        if (n == 0) return reverse;

        int reminder = n % 10;

        reverse = reverse * 10 + reminder;

        return reverse(n / 10, reverse);
    }

    static boolean palindrome(int n){
        return reverse(n, 0) == n;
    }

    static int countZeros(int n, int c){

        if(n == 0) return c;

        int reminder = n % 10;

        if (reminder == 0) return countZeros(n / 10, c + 1);

        return countZeros(n / 10, c);

    }
    public static void main(String[] args) {
//        System.out.println(reverse(1234, 0));
//        System.out.println(palindrome(1221));
        System.out.println(countZeros(209080, 0));
    }
}
