package me.wellyfrs.codility.lessons.lesson4;

import java.util.HashSet;
import java.util.Set;

public class PermCheck {

    public int isPermutation(int[] arr) {
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
