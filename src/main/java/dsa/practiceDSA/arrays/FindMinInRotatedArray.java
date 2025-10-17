package dsa.practiceDSA.arrays;

public class FindMinInRotatedArray {

    static int findmin(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        if (arr[start] < arr[end]){
            return arr[start];
        }
        while (start <= end){

            int mid = start + (end - start) / 2;

            if (mid < end && arr[mid] > arr[mid + 1]){
                return arr[mid + 1];
            }

            if (mid > start && arr[mid] < arr[mid - 1]){
                return arr[mid];
            }
            if (arr[mid] <= arr[start]){
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] input = {4,5,6,7,2,3};
        System.out.println(findmin(input));

    }
}
