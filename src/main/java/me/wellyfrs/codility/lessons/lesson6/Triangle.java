package me.wellyfrs.codility.lessons.lesson6;

import java.util.Arrays;

public class Triangle {

    public int containsTriangularTriplet(int[] arr) {
        int length = arr.length;

        if (length < 3) {
            return 0;
        }

        // Condition: 0 ≤ P < Q < R < N (always positive numbers)
        // With sorting:
        // 1. Q < P + R is guaranteed, because Q < R
        // 2. P < P + Q is guaranteed, because P < R
        // 3. R < P + Q need to be checked
        Arrays.sort(arr);

        for (int i = 2; i < arr.length; i++) {
            int R = arr[i];
            int Q = arr[i - 1];
            int P = arr[i - 2];

            long sum = (long) P + Q;

            if (sum > R) {
                return 1;
            }
        }

        return 0;
    }

}
