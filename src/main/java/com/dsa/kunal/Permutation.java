package com.dsa.kunal;

import java.util.ArrayList;
import java.util.List;

public class Permutation {

    static void permutationofstring(String p, String up){

        if (up.isEmpty()){ System.out.println(p); return;}

        char ch = up.charAt(0);

        for (int i = 0; i <= p.length(); i++) {

            String f = p.substring(0,i);
            String s = p.substring(i);
            permutationofstring(f + ch + s, up.substring(1));
        }
    }

    static List<String> permutationlist(String p, String up){

        if (up.isEmpty()) {
            List<String> list= new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);

        List<String> ans = new ArrayList<>();

        for (int i = 0; i <= p.length(); i++) {

            String f = p.substring(0,i);
            String s = p.substring(i);
            ans.addAll(permutationlist(f + ch + s, up.substring(1)));
        }

        return ans;
    }

    public static void main(String[] args) {

        permutationofstring("", "abc");
//        List<String> list = new ArrayList<>();
//        list = permutationlist("", "abc");
//        System.out.println(list);
    }
}
