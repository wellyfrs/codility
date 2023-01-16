package me.wellyfrs.codility.lessons.lesson9;

public class MaxDoubleSliceSum {

    public int solution(int[] A) {
        int[] maxEnding = new int[A.length];
        int[] maxStarting = new int[A.length];

        int maxDoubleSliceSum = 0;

        for (int i = 1; i < A.length - 1; i++) {
            maxEnding[i] = Math.max(maxEnding[i - 1] + A[i], 0);
            maxStarting[A.length - 1 - i] = Math.max(maxStarting[A.length - i] + A[A.length - 1 - i], 0);
        }

        for (int i = 1; i < A.length - 1; i++) {
            maxDoubleSliceSum = Math.max(maxDoubleSliceSum, maxEnding[i - 1] + maxStarting[i + 1]);
        }

        return maxDoubleSliceSum;
    }

}
