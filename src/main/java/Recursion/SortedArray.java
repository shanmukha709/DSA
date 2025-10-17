package Recursion;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class SortedArray {

    static boolean sorted(int[] arr, int i){

        int n = arr.length - 1;

        if (i >= n){
            return true;
        }

        return arr[i] < arr[i + 1] && sorted(arr, ++i);
    }

    static boolean arrayHaveElement(int[] arr, int target, int index){

        if (index == arr.length){
            return false;
        }

        return arr[index] == target || arrayHaveElement(arr, target, index+1);
    }

    static int findElementInArray(int[] arr, int target, int index){

        if (index == arr.length){
            return -1;
        }
        if (arr[index] == target){
            return index;
        }
        else {
            return findElementInArray(arr, target, index+1);
        }
    }

    static int findElementInArrayFromLast(int[] arr, int target, int index){

        if (index == -1){
            return -1;
        }
        if (arr[index] == target){
            return index;
        }
        else {
            return findElementInArrayFromLast(arr, target, index-1);
        }
    }

    //kept as public to create object
    public List<Integer> collectOccurrences(int[] arr, int target, int index, List<Integer> list){
        if (index == arr.length){
            return list;
        }
        if (arr[index] == target){
            list.add(index);
        }

        return collectOccurrences(arr, target, index+1, list);
    }

    public List<Integer> withoutPassingArrayList(int[] arr, int target, int index){

        List<Integer> list = new ArrayList<>();

        if (index == arr.length){
            return list;
        }
        if (arr[index] == target){
            list.add(index);
        }

        List<Integer> collectfromeverycall = withoutPassingArrayList(arr,target,index+1);

        list.addAll(collectfromeverycall);

        return list;

    }

    public static void main(String[] args) {
        int[] array = {1,2,4,5,9,6,7,9};
        List<Integer> sample = new ArrayList<>();
        System.out.println(sorted(array, 0));
        System.out.println(arrayHaveElement(array, 3, 0));
        System.out.println(findElementInArray(array, 5, 0));
        System.out.println(findElementInArrayFromLast(array, 6, array.length-1));
        SortedArray sr = new SortedArray();
        System.out.println(sr.collectOccurrences(array,9,0,sample));
        System.out.println(sr.withoutPassingArrayList(array,9,0));

    }
}
