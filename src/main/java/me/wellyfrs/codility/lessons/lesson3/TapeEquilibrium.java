package me.wellyfrs.codility.lessons.lesson3;

public class TapeEquilibrium {

    public int solution(int[] arr) {
        int total = 0;

        for (double n : arr) {
            total += n;
        }

        int sum = 0;
        int min = Integer.MAX_VALUE;

        for (int p = 0; p < arr.length - 1; p++) {
            sum += arr[p];
            min = Math.min(min, Math.abs((total-sum) - sum));
        }

        return min;
    }

}
