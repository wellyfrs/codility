package com.wellyfrs.codility.lessons.prefixsums;

public class PassingCars {

    public int countPassingCars(int[] arr) {
        int[] suffixSums = new int[arr.length];

        int acc = 0;

        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == 1) {
                acc++;
            }
            suffixSums[i] = acc;
        }

        int pairs = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                pairs += suffixSums[i];
            }
        }

        return pairs;
    }

}
