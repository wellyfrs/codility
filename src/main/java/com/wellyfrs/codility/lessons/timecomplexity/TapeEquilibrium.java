package com.wellyfrs.codility.lessons.timecomplexity;

public class TapeEquilibrium {

    /**
     * Time complexity: O(n)
     * @param arr non-empty array of N integers within the range [−1,000..1,000]
     * @return minimal absolute difference between two non-empty parts of arr
     */
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
