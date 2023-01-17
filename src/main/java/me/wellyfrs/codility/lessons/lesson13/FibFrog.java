package me.wellyfrs.codility.lessons.lesson13;

public class FibFrog {

    public int solution(int[] A) {
        int[] fibonacciSeq = fibonacci(A.length);

        int result = -1;

        for (int i = 0; i <= A.length; i++) {
            if (i == A.length || A[i] == 1) {
                int min = Integer.MAX_VALUE;

                for (int j = 0; j < fibonacciSeq.length && fibonacciSeq[j] <= i + 1; j++) {
                    int left = i - fibonacciSeq[j];

                    if (left == -1) {
                        min = 1;
                        break;
                    } else if (A[left] > 0) {
                        min = Math.min(min, A[left] + 1);
                    }
                }

                if (i < A.length) {
                    if (min == Integer.MAX_VALUE) {
                        A[i] = 0;
                    } else {
                        A[i] = min;
                    }
                } else {
                    if (min != Integer.MAX_VALUE) {
                        result = min;
                    }
                }
            }
        }

        return result;
    }

    // Dynamic Programming
    private int[] fibonacci(int n) {
        int[] sequence = new int[n < 2 ? 2 : n + 1];

        sequence[0] = 1;
        sequence[1] = 2;

        for (int i = 2; i <= n; i++) {
            sequence[i] = sequence[i - 1] + sequence[i - 2];
        }

        return sequence;
    }
}
