package me.wellyfrs.codility.lessons.lesson8;

import java.util.HashMap;
import java.util.Map;

public class Dominator {

    public int findAnyIndexOfDominator(int[] A) {
        Map<Integer, Integer> count = new HashMap<>();

        for (int i = 0; i < A.length; i++) {
            count.put(A[i], count.getOrDefault(A[i], 0) + 1);

            if (count.get(A[i]) > A.length / 2) {
                return i;
            }
        }

        return -1;
    }

}
