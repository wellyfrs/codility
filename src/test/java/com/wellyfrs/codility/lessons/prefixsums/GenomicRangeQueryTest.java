package com.wellyfrs.codility.lessons.prefixsums;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class GenomicRangeQueryTest {

    private final GenomicRangeQuery underTest = new GenomicRangeQuery();

    @Test
    void testSolution() {
        // given
        String S = "CAGCCTA";
        int[] P = { 2, 5, 0 };
        int[] Q = { 4, 5, 6 };

        // when
        int[] result = underTest.findMinImpactFactor(S, Q, P);

        // then
        assertArrayEquals(new int[] { 2, 4, 1 }, result);
    }
}