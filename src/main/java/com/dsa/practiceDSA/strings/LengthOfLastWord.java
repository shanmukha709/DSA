package com.dsa.practiceDSA.strings;

public class LengthOfLastWord {
    static int lengthOfLastWord(String s) {
        s = s.trim();
        String[] words = s.split(" ");

        return words[words.length-1].length();

    }

    public static void main(String[] args) {
        String input = "   fly me   to   the moon  ";
        System.out.println(lengthOfLastWord(input));
    }
}
