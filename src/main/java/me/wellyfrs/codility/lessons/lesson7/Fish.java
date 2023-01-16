package me.wellyfrs.codility.lessons.lesson7;

import java.util.Stack;

public class Fish {

    public int solution(int[] A, int[] B) {
        if (A.length == 0) {
            return 0;
        }

        Stack<Integer> fishes = new Stack<>();
        int result = A.length;

        for (int i = 0; i < A.length; i++) {
            if (B[i] == 1) {
                fishes.push(A[i]);
            }

            if (B[i] == 0) {
                while (!fishes.isEmpty()) {
                    if (A[i] < fishes.peek()) {
                        result--;
                        break;
                    } else if (A[i] > fishes.peek()) {
                        result--;
                        fishes.pop();
                    }
                }
            }
        }

        return result;
    }

}
