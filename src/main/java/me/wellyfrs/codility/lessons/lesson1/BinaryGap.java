package me.wellyfrs.codility.lessons.lesson1;

public class BinaryGap {

    public int findLongestBinaryGapLength(int n) {
        int gap = 0;
        int max = 0;

        for (char c : Integer.toBinaryString(n).toCharArray()) {
            if (c == '0') {
                gap++;
            } else {
                max = Math.max(max, gap);
                gap = 0;
            }
        }

        return max;
    }

}