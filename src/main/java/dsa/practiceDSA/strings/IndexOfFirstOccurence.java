package dsa.practiceDSA.strings;

public class IndexOfFirstOccurence {

    static int firstoccurrence(String str, String target){

        return str.indexOf(target);
    }

    static int firstoccurrence2(String str, String target){

        int n = str.length();
        int m = target.length();

        if (m == 0) return 0;

        for (int i = 0; i < n - m; i++) {

            if (str.substring(i, i + m).equals(target)){
                return i;
            }
        }
        return -1;
    }

    static int firstoccurrence3(String str, String target){
        int n = str.length();
        int m = target.length();

        if (m == 0) return 0;

        for (int i = 0; i < n - m; i++) {
            int j = 0;

            while(j < m && str.charAt(i + j) == target.charAt(j)){
                j++;
            }

            if (j == m){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String s = "shanmukhashannu";
        String t = "kh";

        System.out.println(firstoccurrence3(s,t));
    }
}
