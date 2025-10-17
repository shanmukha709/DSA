package dsa.kunal;

public class StringsChanges {
    static void skipcharinstring(String newstring, String str){

        if (str.isEmpty()){
            System.out.println(newstring);
            return;
        }

        char ch = str.charAt(0);

        if (ch == 'a') skipcharinstring(newstring, str.substring(1));
        else skipcharinstring(newstring + ch, str.substring(1));
    }

    static String returingstring(String str){

        if(str.isEmpty()){
            return "";
        }

        char ch = str.charAt(0);

        if (ch == 'a') return returingstring(str.substring(1));
        else return ch + returingstring(str.substring(1));

    }

    static String skipstring(String str){

        if (str.isEmpty()) return "";

        if (str.startsWith("sh")) return skipstring(str.substring(2));
        else return str.charAt(0) + skipstring(str.substring(1));

    }

    static String skipstringparts(String str){

        if (str.isEmpty()) return "";

        if (str.startsWith("sh") && !str.startsWith("shahf")) return skipstringparts(str.substring(2));
        else return str.charAt(0) + str.substring(1);

    }

    public static void main(String[] args) {

        String newstring = "";
        String str = "shannu";

//        skipcharinstring(newstring,str);
        System.out.println(skipstringparts(str));
    }
}
