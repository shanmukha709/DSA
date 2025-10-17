package dsa.practiceDSA.arrays;

public class RemoveDuplicates {

    static int removeduplicates(int[] arr){

        if (arr.length == 0) return 0;
        
        int i = 0;
        for (int j = 1; j < arr.length; j++) {
            if (arr[j] != arr[i]){
                i++;
                arr[i] = arr[j];
            }
        }
        return i + 1;
    }

    static int removeElement(int[] arr, int val){

        if (arr.length == 0) return 0;

        int i = 0;
        for (int j = 1; j < arr.length; j++) {
            if (arr[j] != val){
                arr[i] = arr[j];
                i++;
            }
        }
        return i;
    }

    public static void main(String[] args) {

        int[] nums = {3,2,2,3,2};
        System.out.println(removeElement(nums, 3));

    }
}
