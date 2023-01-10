package com.wellyfrs.codility.lessons.countingelements;

public class MissingInteger {

    public int findSmallestMissingPositiveInteger(int[] arr) {
        int[] counters = new int[1_000_000];

        for (int n : arr) {
            if (n > 0) {
                counters[n] = 1;
            }
        }

        for (int i = 1; i <= counters.length; i++) {
            if (counters[i] == 0) return i;
        }

        return 1;
    }

}
