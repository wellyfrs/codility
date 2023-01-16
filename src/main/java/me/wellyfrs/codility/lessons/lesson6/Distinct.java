package me.wellyfrs.codility.lessons.lesson6;

import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;

public class Distinct {

    public int countDistinctItemsUsingSorting(int[] arr) {
        if (arr.length == 0) {
            return 0;
        }

        Arrays.sort(arr);

        int result = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                result++;
            }
        }

        return result;
    }

    /**
     * Space complexity: O(2n)
     */
    public int countDistinctItemsCleverly(int[] A) {
        Set<Integer> bucket = new HashSet<>();
        for (int a: A) bucket.add(a);
        return bucket.size();
    }

}
