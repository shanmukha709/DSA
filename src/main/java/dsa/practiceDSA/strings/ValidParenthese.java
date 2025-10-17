package dsa.practiceDSA.strings;

import java.util.Stack;

public class ValidParenthese {

    static boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()){

            if (c == '(' || c == '{' || c == '['){
                stack.push(c);
            }
            else {
                if (stack.isEmpty()) return false;
                char ch = stack.pop();

                if (c == ')' && ch != '(' || c == '}' && ch != '{' || c == ']' && ch != '['){
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String input = "[({})]";
        System.out.println(isValid(input));
    }

}
