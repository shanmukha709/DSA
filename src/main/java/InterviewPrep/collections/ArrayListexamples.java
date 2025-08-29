package InterviewPrep.collections;

import java.util.*;
import java.util.stream.Collectors;

public class ArrayListexamples {

    public static void printList(List<?> list) {
        for (Object obj : list) {
            System.out.println(obj);
        }
    }


    public static void main(String[] args) {

        List<Integer> firstway = List.of(5,2,6,5,7,1,3); //Creates an immutable list (cannot add, remove, or modify).
        List<Integer> secondway = Arrays.asList(5,2,6,5,7,1,3); //You can only set(i, val) (modify elements).
        List<Integer> thirdway = new ArrayList<>(List.of(5,2,6,5,7,1,3)); //Creates a mutable list (add/remove/modify works).
        List<Integer> fourthway = new ArrayList<>();
        fourthway.add(5);
        fourthway.add(6);
        fourthway.add(5);
        fourthway.add(7);
        fourthway.add(1);

        List<Object> mixedone = Arrays.asList(1,2,3,"Hi");

        fourthway.addAll(firstway);


//        Collections.sort(list);
        System.out.println(firstway);
        System.out.println(mixedone);

        // Separate integers and strings

        //manual approach

        List<Object> allValues = Arrays.asList(1, 2, 3, "hi", "hello");

        List<Integer> intList = new ArrayList<>();
        List<String> strList = new ArrayList<>();

        for (Object obj : allValues) {
            if (obj instanceof Integer) {
                intList.add((Integer) obj);
            } else if (obj instanceof String) {
                strList.add((String) obj);
            }
        }

        System.out.println("Integers: " + intList);
        System.out.println("Strings: " + strList);

        printList(intList); // from printlist method, the method will accept any type
        printList(strList);

        //with stram and lambda
        List<Integer> intList2 = allValues.stream()
                .filter(obj -> obj instanceof Integer)
                .map(obj -> (Integer) obj)
                .toList();

        List<String> strList2 = allValues.stream()
                .filter(obj -> obj instanceof String)
                .map(obj -> (String) obj)
                .toList();

        System.out.println("Integers: " + intList2);
        System.out.println("Strings: " + strList2);

        //Group by class name
        Map<Class<?>, List<Object>> grouped = allValues.stream()
                .collect(Collectors.groupingBy(Object::getClass));

        System.out.println("Integers: " + grouped.get(Integer.class));
        System.out.println("Strings: " + grouped.get(String.class));


    }

}
