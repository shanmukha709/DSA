package com.dsa.kunal;

public class PeakIndexInArray {

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
    static int binarySearch(int[] arr, int start, int end, int target, boolean isAsc) {
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }

    // Find the target in mountain array
    static int findvalueinmountainarray(int[] arr, int target) {
        int peak = findingpeakindex(arr);

        // Try searching in the left half (ascending)
        int index = binarySearch(arr, 0, peak, target, true);
        if (index != -1) {
            return index;
        }

        // Try searching in the right half (descending)
        return binarySearch(arr, peak + 1, arr.length - 1, target, false);
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 7, 8, 9, 6, 5, 2, 1};
        int target = 1;

        System.out.println("Index value = " + findvalueinmountainarray(arr, target));
    }
}
