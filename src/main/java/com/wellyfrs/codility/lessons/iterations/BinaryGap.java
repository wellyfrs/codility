package com.wellyfrs.codility.lessons.iterations;

public class BinaryGap {

    public int findLongestBinaryGapLength(int n) {
        int gap = 0;
        int max = 0;

        for (char c : Integer.toBinaryString(n).toCharArray()) {
            if (c == '0') {
                gap++;
            } else {
                if (gap > max) {
                    max = gap;
                }
                gap = 0;
            }
        }

        return max;
    }

}