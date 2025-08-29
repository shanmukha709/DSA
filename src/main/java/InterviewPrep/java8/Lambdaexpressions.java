package InterviewPrep.java8;

import java.util.function.Consumer;
import java.util.function.Predicate;

@FunctionalInterface
public interface Lambdaexpressions {

//Lambda expressions :
//    Is nothing but anonymous function
//    in curly bases if we want to return any value then we should use return statement
//    without curly bases we cannot use return keyword
//    We should use this only with functional interface

//Functional Interfaces
//    It should contain only one abstract method
//    But it can have any number of static and default methods
//    It supports functional programming (Lambda expressions)



    void sampleabstract();

    default void lambdaexpression(){
        System.out.println("Default method");
    }

    public static void main(String[] args) {
        Lambdaexpressions le = () -> System.out.println("Abstract method with lambda expression");
        le.sampleabstract();
        le.lambdaexpression();

        Predicate<Integer> hs = a -> a % 2 == 0; // functional interface
        Consumer<Integer> cs = a -> System.out.println(a);  // functional interface

        System.out.println(hs.test(3));
        cs.accept(9);
    }
}
