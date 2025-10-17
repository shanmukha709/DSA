package dsa.kunal;

public class FindInRotatedSortedArray {

    // Find the peak index in mountain array
    static int findingpeakindex(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }

    // General binary search for both ascending and descending
    static int binarySearch(int[] arr, int start, int end, int target) {

        while (start <= end) {
            int mid = start + (end - start) / 2;

                if (target < arr[mid]) {
                    end = mid - 1;
                } else if (target > arr[mid]){
                    start = mid + 1;
                }
                else {
                    return mid;
                }
        }
        return -1;
    }

    // Find the target in mountain array
    static int findvalueinmountainarray(int[] arr, int target) {
        int peak = findingpeakindex(arr);
//        int rotationcountt = peak + 1;

        // Try searching in the left half (ascending)
        int index = binarySearch(arr, 0, peak, target);
        if (index != -1) {
            return index;
        }

        // Try searching in the right half (descending)
        return binarySearch(arr, peak + 1, arr.length - 1, target);
    }

    static int pivotinrotatedarray(int[] arr){

        int start = 0;
        int end = arr.length-1;

        while(start <= end){

            int mid = start + (end - start) / 2;

            if(mid < end && arr[mid] > arr [mid + 1]){
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]){
                return mid-1;
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
        int[] arr = {1, 4, 7, 8, 9, 10, 1, 3, 5, 7};
        int target = 5;

        System.out.println("Index value = " + pivotinrotatedarray(arr));
    }
}
