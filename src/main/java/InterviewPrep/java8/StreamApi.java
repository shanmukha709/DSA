package InterviewPrep.java8;

import java.util.*;
import java.util.stream.*;

public class StreamApi {

    public static void touppercase(){
        String str = "This will convert whole string at one unit";
        System.out.println(str);
        String output1 = Stream.of(str)
                .map(String::toUpperCase)
                .findFirst()
                .orElse("");
        System.out.println(output1);


        String str1 = "This will convert each word to uppercase";
        System.out.println(str1);
        String output2 = Arrays.stream(str1.split(" "))
                .map(String::toUpperCase)
                .collect(Collectors.joining(" "));
        System.out.println(output2);

        String str2 = "This will convert each Character to uppercase";
        System.out.println(str2);

        String output3 = str2.chars()
                .mapToObj(c -> (char) c)
                .map(Character::toUpperCase)
                .map(String::valueOf)
                .collect(Collectors.joining());
        System.out.println(output3);
    }

    public static void main(String[] args) {
//        touppercase();

        int[] nums = {5,3,6,7,2,1};
        List<Integer> list = List.of(4,6,7,3,4,8,9);
        Set<Integer> set1 = new HashSet<>(list);

        System.out.println(set1);
    }
}
