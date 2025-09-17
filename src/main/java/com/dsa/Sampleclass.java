package com.dsa;

import java.util.*;
import java.util.stream.Collectors;

public class Sampleclass {
    public static void main(String[] args) {
        Integer[] arr = {1,2,2,3,4,5,5,6,6,7,8,8};
        int[] arr1 = {11,23,41,24,56,78};

        List<Integer> list1 = new ArrayList<>();
        Collections.addAll(list1, arr);

        List<Integer> list = new ArrayList<>(List.of(1,3,4,4,7,5,4,3,7,8));

        Optional<Integer> sum = list.stream().filter(n -> n % 2 == 0).reduce((a,b) -> a + b);
        List<Integer> output1 = list.stream().distinct().toList();
        List<Integer> output2 = Arrays.stream(arr).distinct().toList();
        Set<Integer> set = Arrays.stream(arr1).boxed().collect(Collectors.toSet());
        long output = Arrays.stream(arr).distinct().count();
        Set<Integer> set1 = new HashSet<>(List.of(arr));
        System.out.println(sum);
        System.out.println(set);

    }
}
