package dsa.practiceDSA;

import java.util.*;

public class ComparePrefixCorrected {
    static int[][] solve(int N, String S) {
        int[][] result = new int[N-1][3];

        for (int i = 1; i < N; i++) {
            String prefix = S.substring(0, i);
            Map<Integer,Integer> freqmap = new HashMap<>();

            for (int j = 1; j <= N - i; j++) {
                String sub = S.substring(j, j + i);
                int match = 0;

                for (int k = 0; k < i; k++) {

                    if (prefix.charAt(k) == sub.charAt(k)){
                        match++;
                    }else {
                        break;
                    }
                }

                freqmap.put(match, freqmap.getOrDefault(match, 0) + 1);
            }
            List<Map.Entry<Integer, Integer>> freqlist = new ArrayList<>(freqmap.entrySet());
            freqlist.sort((a, b) -> b.getValue().compareTo(a.getValue()));
            int[] newar;
            newar = new int[]{2};
            for (int j = 0; j < 3; j++) {
                if (j < freqlist.size()){
                    result[i - 1][j] = freqlist.get(j).getValue();
                }
                else {
                    result[i - 1][j] = 0;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String input = "abcdabcabcdaabcd";
        int[][] ans = solve(input.length(), input);

        for (int[] row : ans) {
            System.out.println(row[0] + " " + row[1] + " " + row[2]);
        }
    }
}
