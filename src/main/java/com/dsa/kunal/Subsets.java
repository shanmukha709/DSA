package com.dsa.kunal;

import java.util.ArrayList;
import java.util.List;

public class Subsets {

    static void subsetofstring(String p, String up){

        if (up.isEmpty()) {System.out.println(p); return;}

        char c = up.charAt(0);

        subsetofstring(p + c, up.substring(1));
        subsetofstring(p, up.substring(1));
    }

    static void subsetofstringeithASCII(String p, String up){

        if (up.isEmpty()) {System.out.println(p); return;}

        char c = up.charAt(0);

        subsetofstringeithASCII(p + c, up.substring(1));
        subsetofstringeithASCII(p, up.substring(1));
        subsetofstringeithASCII(p + (c+0), up.substring(1) );
    }

    static List<List<Integer>> subseqiteration(int[] arr){

        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());

        for (int num : arr){
            int n = outer.size();

            for (int i = 0; i < n; i ++){

                List<Integer> inner = new ArrayList<>(outer.get(i));
                inner.add(num);
                outer.add(inner);
            }
        }
        return outer;
    }

    static List<List<String>> subseqiteration2(String[] arr){

        List<List<String>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());

        for (String num : arr){
            int n = outer.size();

            for (int i = 0; i < n; i ++){

                List<String> inner = new ArrayList<>(outer.get(i));
                inner.add(String.valueOf(num));
                outer.add(inner);
            }
        }
        return outer;
    }


    public static void main(String[] args) {
//        subsetofstringeithASCII("","abc");
        String[] arr = {"a", "b", "c"};
        int[] nums = {1,2,3};
        List<List<Integer>> s = subseqiteration(nums);
//        List<List<String>> ans = subseqiteration2(arr);
        System.out.println(s);

    }
}
