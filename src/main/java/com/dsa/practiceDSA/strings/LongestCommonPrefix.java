package com.dsa.practiceDSA.strings;

public class LongestCommonPrefix {
    static String longestCommonPrefix(String[] strs){
        if (strs == null || strs.length == 0) return "";
        String prefix = strs[0];

        for(String name : strs){
            while (!name.startsWith(prefix)){                        //for (int i = 1; i < strs.length; i++) {
                prefix = prefix.substring(0, prefix.length()-1);     //while (strs[i].indexOf(prefix) != 0){
                if (prefix.isEmpty()){
                    return "";
                }
            }
        }
        return prefix;
    }

    public static void main(String[] args) {

        String[] input = {"dog","racecar","car"};
        System.out.println(longestCommonPrefix(input));
    }
}
