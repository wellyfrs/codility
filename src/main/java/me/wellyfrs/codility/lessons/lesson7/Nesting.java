package me.wellyfrs.codility.lessons.lesson7;

import java.util.Stack;

public class Nesting {

    public int solution(String S) {
        if (S.length() == 0) {
            return 1;
        } else if (S.length() % 2 != 0) {
            return 0;
        }

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);

            if (isOpeningBracket(c)) {
                stack.push(c);
            }
            else {
                if (stack.isEmpty()) {
                    return 0;
                } else {
                    if (isOpeningBracket(stack.peek())) {
                        stack.pop();
                    } else {
                        return 0;
                    }
                }
            }
        }

        return stack.isEmpty() ? 1 : 0;
    }

    private boolean isOpeningBracket(char c) {
        return c == '(';
    }

}
