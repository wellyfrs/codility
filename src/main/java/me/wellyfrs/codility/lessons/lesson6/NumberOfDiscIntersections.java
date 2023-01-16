package me.wellyfrs.codility.lessons.lesson6;

import java.util.Arrays;

public class NumberOfDiscIntersections {

    public int countDiscIntersections(int[] arr) {
        int[] leftPoints = new int[arr.length];
        int[] rightPoints = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            leftPoints[i] = i - arr[i];
            rightPoints[i] = i + arr[i];
        }

        Arrays.sort(leftPoints);
        Arrays.sort(rightPoints);

        int result = 0;
        int j = 0;

        for (int k = 0; k < arr.length; k++) {
            while (j < arr.length && rightPoints[k] >= leftPoints[j]) {
                result += j - k;
                j++;
            }

            if (result > 10_000_000) {
                return -1;
            }
        }

        return result;
    }

}
