package me.wellyfrs.codility.lessons.lesson4;

public class MaxCounters {

    public int[] calculateCounters(int N, int[] operations) {
        int[] counters = new int[N];

        int maxCounter = 0;
        int lastAllIncrement = 0;

        for (int op : operations) {
            int pos = op - 1;

            if (op <= N) {
                if (counters[pos] < lastAllIncrement) {
                    counters[pos] = lastAllIncrement + 1;
                } else {
                    counters[pos]++;
                }

                maxCounter = Math.max(maxCounter, counters[pos]);
            } else {
                lastAllIncrement = maxCounter;
            }
        }

        for (int i = 0; i < counters.length; i++) {
            counters[i] = Math.max(counters[i], lastAllIncrement);
        }

        return counters;
    }

}
