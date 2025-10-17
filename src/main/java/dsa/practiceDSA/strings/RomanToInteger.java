package dsa.practiceDSA.strings;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;
import java.util.SortedMap;

public class RomanToInteger {

    static int romanToInt(String s) {

        Map<Character, Integer> store = new HashMap<>();

        store.put('I', 1);
        store.put('V', 5);store.put('C', 100);
        store.put('X', 10);store.put('D', 500);
        store.put('L', 50);store.put('M', 1000);

        int results = 0;
        for (int i = 0; i < s.length(); i++) {
            int current = store.get(s.charAt(i));
            int next = ((i + 1) < s.length()) ? store.get(s.charAt(i + 1)) : 0;

            if (current < next) results -= current;
            else results += current;
        }

        return results;
    }

    public static void main(String[] args) {
        String str = "LVIII";
        System.out.println(romanToInt(str));
    }
}
