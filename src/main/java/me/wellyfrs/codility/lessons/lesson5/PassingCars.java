package me.wellyfrs.codility.lessons.lesson5;

public class PassingCars {

    public int countPassingCars(int[] arr) {
        int length = arr.length;

        // create suffix sum array
        int[] suffixSum = new int[length];

        // initialize suffix sum array
        suffixSum[length - 1] = arr[length - 1];

        // calculate suffix sum
        for (int i = length - 2; i >= 0; i--) {
            suffixSum[i] = suffixSum[i + 1] + arr[i];
        }

        int pairs = 0;

        for (int i = 0; i < length; i++) {
            if (arr[i] == 0) {
                pairs += suffixSum[i];

                if (pairs > 1_000_000_000) {
                    return -1;
                }
            }
        }

        return pairs;
    }

}
