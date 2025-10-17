package dsa.kunal;

public class BitwiseOperators {

    static boolean oddoreven(int n){

        return (n & 1) == 0;
    }

    static int finduniqueelement(int[] arr){

        int res = 0;

        for(int num : arr){
            res = res ^ num;
        }

        return res;
    }

    static int findithbitofnumber(int n, int i){

        return (n >> i) & 1;
    }

    static  int rightmostsetbit(int n){

        return n & -n;
    }

    public static void main(String[] args) {

        int[] arr = {3,5,2,7,2,5,3};

//        System.out.println(oddoreven(4));
//        System.out.println(finduniqueelement(arr));
//        System.out.println(findithbitofnumber(5, 2));
        System.out.println(rightmostsetbit(18));

    }
}
