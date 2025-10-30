package Recursion;

public class RotatedBinerySearch {

    static int rotatedbinersearch(int[] arr, int target, int start, int end){

        if (start > end) return -1;

        int mid = start + (end - start) / 2;

        if (arr[mid] == target) return mid;

        if (arr[start] <= arr[mid]){
                if (target >= arr[start] && target <= arr[mid]){
                    return rotatedbinersearch(arr, target,start, mid-1);
                }
                else {
                    return rotatedbinersearch(arr, target, mid+1, end);
                }
        }

        if(target >= arr[mid] && target <= arr[end]){
            return rotatedbinersearch(arr, target,mid+1, end);
        }else {
            return rotatedbinersearch(arr, target, start, mid-1);
        }
    }

    public static void main(String[] args) {
        int[] arr = {5,6,1,2,3,4};
        System.out.println(rotatedbinersearch(arr, 3,0, arr.length-1));
    }
}
