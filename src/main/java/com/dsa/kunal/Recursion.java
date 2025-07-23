package com.dsa.kunal;

public class Recursion {

    static void printnumbersdecending(int n){

        if (n == 0){
            return;
        }
        System.out.println(n);
        printnumbersdecending(n - 1);
    }

    static void printnumbersascending(int n){

        if (n == 0){
            return;
        }
        printnumbersdecending(n - 1);
        
    }

    static int sumofdigits(int n){

        if (n == 0)
            return 0;
        int res = (n % 10);
        return res + sumofdigits(n / 10);
    }

    static int sumofgivennumbers(int n){

        if (n == 0)
            return 0;
        return n + sumofgivennumbers(n - 1);
    }

    static boolean sortedarray(int[] arr, int index){

        if (index == arr.length - 1){
            return true;
        }
        else {
            return arr[index] < arr[index + 1] && sortedarray(arr, index + 1);
        }
    }
    
    static int reverse(int n, int sum){
        
        if (n == 0)
            return sum;
        
        int rem = n % 10;
        sum = sum * 10 + rem;
        return reverse(n / 10, sum);
    }
    
    static boolean palindrome(int n){

        return n == reverse(n, 0);
    }

    static boolean palindromestring(String str, int start, int end){

        if (start >= end){
            return true;
        }
        if (str.charAt(start) != str.charAt(end)){
            return false;
        }

        return palindromestring(str, start+1, end-1);
    }

    static int countnumbers(int n, int count){

        if (n == 0)
            return count;

        int rem = n % 10;

        if (rem == 0){
            return countnumbers(n / 10, count+1);
        }

        return countnumbers(n / 10, count);
    }

    public static void main(String[] args) {
//        printnumbersdecending(5);
//        printnumbersascending(5);
//        int[] arr = {1,2,3,4,5,7,8,10,9};
//        System.out.println(sortedarray(arr, 0));
//        System.out.println(sumofdigits(1234));
//        System.out.println(sumofgivennumbers(5));
//        System.out.println(reverse(12345,0));
//        System.out.println(palindrome(1234321));
//        String str = "shahs";
//        System.out.println(palindromestring(str, 0, str.length()-1));
        System.out.println(countnumbers(302005, 0));
    }
}
