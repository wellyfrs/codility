package com.wellyfrs.codility.lessons.lesson1;

public class BinaryGap {

    @SuppressWarnings("squid:S117")
    public int solution(int N) {
        int gap = 0;
        int max = 0;

        for (char c : Integer.toBinaryString(N).toCharArray()) {
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