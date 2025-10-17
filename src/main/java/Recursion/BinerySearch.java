package Recursion;

public class BinerySearch {

    static int binerysearch(int[] arr, int target, int start, int end){


        if(start < end){

            int mid = start + (end - start) / 2;

            if (target == arr[mid]){
                return mid;
            }

            if (target < arr[mid]){
                return binerysearch(arr,target,start,mid - 1);
            }

            return binerysearch(arr,target,mid + 1, end);
        }
        return -1;
    }

    public static void main(String[] args) {

        int[] arr = {0,1,3,4,5,6,7,8,9};
        System.out.println(binerysearch(arr,2,0, arr.length - 1));
    }
}
