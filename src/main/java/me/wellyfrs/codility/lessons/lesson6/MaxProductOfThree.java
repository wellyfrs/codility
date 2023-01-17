package me.wellyfrs.codility.lessons.lesson6;

import java.util.Arrays;

public class MaxProductOfThree {

    public int calculateMaxProductOfTriplets(int[] arr) {
        Arrays.sort(arr);

        int length = arr.length;

        // case of the biggest positives, trivial: (+) * (+) * (+) = (+)
        int candidate1 = arr[length-3] * arr[length-2] * arr[length-1];

        // case of 2 big negatives, and 1 big positive, resulting in big positive: (-) * (-) * (+) = (+)
        int candidate2 = arr[0] * arr[1] * arr[length-1];

        return Math.max(candidate1, candidate2);
    }

}
