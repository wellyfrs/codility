package com.wellyfrs.codility.lessons.countingelements;

import java.util.HashSet;
import java.util.Set;

public class PermCheck {

    public int isPermutation(int[] arr) {
        // Cases of not permutation:
        // 1. Duplication
        // 2. Number >= N
        // 3. Missing number from 1...N

        Set<Integer> bucket = new HashSet<>();

        for (int n : arr) {
            if (bucket.contains(n) || n > arr.length) {
                return 0;
            }
            bucket.add(n);
        }
        return 1;
    }

}
