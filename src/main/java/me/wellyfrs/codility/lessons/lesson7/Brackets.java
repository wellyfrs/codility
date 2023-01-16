package me.wellyfrs.codility.lessons.lesson7;

import java.util.Stack;

public class Brackets {

    public int solution(String S) {
        if (S.length() == 0) {
            return 1;
        } else if (S.length() % 2 != 0) {
            return 0;
        }

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < S.length(); i++) {
            char bracket = S.charAt(i);

            if (isOpeningBracket(bracket)) {
                stack.push(bracket);
            } else {
                if (stack.isEmpty()) {
                    return 0;
                }

                if (isPair(stack.peek(), bracket)) {
                    stack.pop();
                } else {
                    return 0;
                }
            }
        }

        return stack.isEmpty() ? 1 : 0;
    }

    private boolean isOpeningBracket(char bracket) {
        return bracket == '(' || bracket == '[' || bracket == '{';
    }

    private boolean isPair(char a, char b) {
        return ( a == '(' && b == ')' ) || ( a == '[' && b == ']' ) || ( a == '{' && b == '}' );
    }

}
