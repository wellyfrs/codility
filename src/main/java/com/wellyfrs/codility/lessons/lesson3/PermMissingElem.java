package com.wellyfrs.codility.lessons.lesson3;

public class PermMissingElem {

    @SuppressWarnings("squid:S117")
    public int solution(int[] A) {
        long N = (long) A.length + 1;
        long sum = 0;

        for (int a : A) {
            sum += a;
        }

        return (int) ((N * (N + 1) / 2) - sum);
    }

}