package me.wellyfrs.codility.lessons.lesson11;

public class CountNonDivisible {

    /**
     * Time complexity: O(N * log(N))
     */
    public int[] solution(int[] A) {
        int[] counters = new int[2 * A.length + 1];

        int max = 0;

        // count frequency
        // using array of counters
        for (int a : A) {
            counters[a]++;
            max = Math.max(max, a);
        }

        int[] divisors = new int[max + 1];

        for (int i = 2; i * i <= max; i++) {
            for (int j = i * i; j <= max; j += i) {
                divisors[j] += counters[i];

                if (j / i != i) {
                    divisors[j] += counters[j/i];
                }
            }
        }

        int[] result = new int[A.length];

        for (int i = 0; i < A.length; i++) {
            result[i] = A.length - (divisors[A[i]] + counters[A[i]]);

            if (A[i] != 1) {
                result[i] -= counters[1];
            }
        }

        return result;
    }

}
