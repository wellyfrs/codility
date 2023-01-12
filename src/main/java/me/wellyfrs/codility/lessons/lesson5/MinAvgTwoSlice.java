package me.wellyfrs.codility.lessons.lesson5;

public class MinAvgTwoSlice {

    public int findStartingIndexOfMinAvgSlice(int[] arr) {
        int length = arr.length;

        if (length < 3) {
            return 0;
        }

        int result = 0;
        double minAvg = 100_000;

        for (int i = 0; i < length - 1; i++) {
            double t = (arr[i] + arr[i + 1]) / 2.0;

            if (t < minAvg) {
                minAvg = t;
                result = i;
            }
        }

        for (int i = 0; i < length - 2; i++) {
            double t = (arr[i] + arr[i + 1] + arr[i + 2]) / 3.0;

            if (t < minAvg) {
                minAvg = t;
                result = i;
            }
        }

        return result;
    }

}
