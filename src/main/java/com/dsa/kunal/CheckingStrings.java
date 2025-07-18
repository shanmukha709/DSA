package com.dsa.kunal;

public class CheckingStrings {

    static boolean stringequals(String s1, String s2) {

        for (int i = 0; i < s1.length(); i++) {
            boolean check = false; // moved inside the outer loop

            for (int j = 0; j < s2.length(); j++) {
                if (s1.charAt(i) == s2.charAt(j)) {
                    check = true;
                    break;
                }
            }

            if (!check) {
                return false; // char in s1 not found in s2
            }
        }

        return true; // all chars in s1 found in s2
    }

    public static void main(String[] args) {
        String s1 = "shannusj";
        String s2 = "shaaaaaaanu";
        System.out.println(stringequals(s1,s2));
    }
}
