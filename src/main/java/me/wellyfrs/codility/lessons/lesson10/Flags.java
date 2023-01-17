package me.wellyfrs.codility.lessons.lesson10;

public class Flags {

    // TODO: achieve 100%
    public int solution(int[] A) {
        int firstPeak = 0;
        int lastPeak = 0;

        for (int i = 1; i < A.length - 1; i++) {
            if (A[i-1] < A[i] && A[i] > A[i+1]) {
                lastPeak = i + 1;
            }
            if (firstPeak == 0) {
                firstPeak = i;
            }
        }

        int limit = (int) Math.ceil(Math.sqrt(A.length));
        int maxFlags = Integer.MIN_VALUE;

        for (int k = 1; k <= limit; k++) {
            int flags = 0;
            int prevPeak = 0;

            for (int i = firstPeak; i < lastPeak; i++) {
                if (A[i-1] < A[i] && A[i] > A[i+1]) {
                    if (prevPeak == 0 || i - prevPeak >= k) {
                        flags++;
                        prevPeak = i;
                    }
                }
                if (flags == k) {
                    break;
                }
            }

            if (flags <= maxFlags) {
                return maxFlags;
            }

            maxFlags = flags;
        }
        return maxFlags;
    }

}
