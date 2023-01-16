package me.wellyfrs.codility.lessons.lesson9;

public class MaxSliceSum {

    public int solution(int[] A) {
        int maxGlobalSum = Integer.MIN_VALUE;
        int maxLocalSum = 0;

        for (int a: A) {
            maxLocalSum = Math.max(a, maxLocalSum + a);
            maxGlobalSum = Math.max(maxGlobalSum, maxLocalSum);
        }

        return maxGlobalSum;
    }

}
